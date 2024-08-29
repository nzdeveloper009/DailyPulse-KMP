package com.nokhaiz.kmp.dailypulse.android

import android.app.Application
import com.nokhaiz.kmp.dailypulse.android.di.viewModelsModule
import com.nokhaiz.kmp.dailypulse.di.sharedKoinModules
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class DailyPulseApp : Application() {

    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin() {
        val modules = sharedKoinModules + viewModelsModule
        startKoin {
            androidContext(this@DailyPulseApp)
            modules(modules)
        }
    }
}