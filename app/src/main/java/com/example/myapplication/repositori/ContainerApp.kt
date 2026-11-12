
package com.example.myapplication.repositori

import android.content.Context

interface ContainerApp {
    val repositoriSiswa: RepositoriSiswa
}

class DefaultContainerApp(private val context: Context) : ContainerApp {
}
