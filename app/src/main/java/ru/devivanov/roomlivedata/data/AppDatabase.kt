package ru.devivanov.roomlivedata.data

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [StringEntity::class], version = 1, exportSchema = false)
abstract class AppDatabase : RoomDatabase() {
    abstract fun stringEntityDao(): StringEntityDAO
}