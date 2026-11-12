package com.example.myapplication.room

import androidx.room.Insert
import androidx.room.Query

interface SiswaDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE))
    suspend fun insert(siswa: Siswa)

    @Query("SELECT * from tblSiswa ORDER BY nama ASC"
}