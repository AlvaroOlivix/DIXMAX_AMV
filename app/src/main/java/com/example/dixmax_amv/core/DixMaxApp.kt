package com.example.dixmax_amv.core

import android.app.Application
import com.example.dixmax_amv.core.di.AppModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.GlobalContext.startKoin
import org.koin.ksp.generated.module

class DixMaxApp : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@DixMaxApp)
            // Load modules
            modules(AppModule().module)
        }
    }
}