package com.nokhaiz.kmp.dailypulse.articles

import com.nokhaiz.kmp.dailypulse.BaseViewModel
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.serialization.kotlinx.json.json
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import kotlinx.serialization.json.Json

// https://github.com/petros-efthymiou/DailyPulse

class ArticlesViewModel(
    private val useCase: ArticlesUseCase
)  : BaseViewModel() {

    private val _articlesState: MutableStateFlow<ArticlesState> =
        MutableStateFlow(ArticlesState(loading = true))

    val articlesState: StateFlow<ArticlesState>
        get() = _articlesState

    init {
        getArticles()
    }

    private fun getArticles() {
        scope.launch {
            val fetchedArticles = useCase.getArticles()

            _articlesState.emit(ArticlesState(articles = fetchedArticles))
        }
    }
}