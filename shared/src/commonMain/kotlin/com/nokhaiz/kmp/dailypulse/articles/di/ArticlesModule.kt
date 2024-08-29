package com.nokhaiz.kmp.dailypulse.articles.di

import com.nokhaiz.kmp.dailypulse.articles.ArticlesService
import com.nokhaiz.kmp.dailypulse.articles.ArticlesUseCase
import com.nokhaiz.kmp.dailypulse.articles.ArticlesViewModel
import org.koin.dsl.module

val articlesModule = module {
    single<ArticlesService> { ArticlesService(get()) }
    single<ArticlesUseCase> { ArticlesUseCase(get()) }
    single<ArticlesViewModel> { ArticlesViewModel(get()) }
}