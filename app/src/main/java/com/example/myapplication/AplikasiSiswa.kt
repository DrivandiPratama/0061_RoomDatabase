
package com.example.myapplication.repositori

import android.app.Application

class AplikasiSiswa : Application() {

    lateinit var container: ContainerApp

    override fun onCreate() {
        super.onCreate()
        container = DefaultContainerApp(this)
    }
}
