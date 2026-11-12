package com.example.myapplication.room

import androidx.room.Insert
import androidx.room.Query

interface SiswaDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE))
}