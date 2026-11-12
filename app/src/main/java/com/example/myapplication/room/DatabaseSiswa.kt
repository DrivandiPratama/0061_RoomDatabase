package com.example.myapplication.room

import androidx.room.Database
import androidx.room.Room


@Database(entities = [Siswa::class], version = 1, exportSchema = false)])

abstract class SiswaDatabase : RoomDatabase() {

    abstract fun siswaDao() : SiswaDao

    companion object{
        @Volatile
        private var INSTANCE : SiswaDatabase? = null

        fun getDatabase(context: Context) : SiswaDatabase {
            return INSTANCE ?: synchronized(this) {
                Room.databaseBuilder(
                    context,
                    DatabaseSiswa::class.java,
                    "siswa_database"
                )
                    .build().also { INSTANCE = it }
            }
        }
    }
}