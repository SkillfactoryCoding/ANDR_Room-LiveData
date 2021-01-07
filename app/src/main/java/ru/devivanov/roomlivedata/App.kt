package ru.devivanov.roomlivedata

import android.app.Application
import androidx.room.Room
import ru.devivanov.roomlivedata.data.AppDatabase
import ru.devivanov.roomlivedata.data.StringEntityDAO

class App : Application() {
    lateinit var stringEntityDAO: StringEntityDAO

    override fun onCreate() {
        super.onCreate()
        instance = this

        val db = Room.databaseBuilder(this, AppDatabase::class.java, "string_DB")
            .build()
        stringEntityDAO = db.stringEntityDao()
    }

    companion object {
        lateinit var instance: App
            private set
    }
}