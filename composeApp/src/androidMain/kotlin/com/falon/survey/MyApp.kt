package com.falon.survey

import android.app.Application
import com.google.firebase.FirebaseApp
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger

class MyApp : Application() {

    override fun onCreate() {
        super.onCreate()
        Instance = this
        FirebaseApp.initializeApp(this)

        initKoin {
            androidContext(this@MyApp)
            androidLogger()
        }
    }

    companion object {

        var Instance: MyApp? = null
    }
}
