package com.nokhaiz.kmp.dailypulse.di

import com.nokhaiz.kmp.dailypulse.articles.di.articlesModule

val sharedKoinModules = listOf(
    articlesModule,
    networkModule
)