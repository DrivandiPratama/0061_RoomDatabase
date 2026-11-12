package com.example.myapplication.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.myapplication.repositori.RepositoriSiswa
import com.example.myapplication.room.Siswa

class EntryViewModel(private val repositoriSiswa: RepositoriSiswa) : ViewModel() {
}
