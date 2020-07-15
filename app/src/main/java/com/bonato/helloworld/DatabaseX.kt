package com.bonato.helloworld

import androidx.room.RoomDatabase
import androidx.room.Database
import androidx.room.Room
import android.content.Context

@Database(entities = [Customer::class, Salesman::class], version = 0, exportSchema = false)
abstract class DatabaseX : RoomDatabase() {

    abstract fun customerDao(): CustomerDao
    //abstract fun salesmanDao(): SalesmanDao

    companion object {
        // Singleton prevents multiple instances of database opening at the
        // same time.
        // The companion object is a singleton, and its members can be accessed directly via the name of the containing class
        @Volatile
        private var INSTANCE: DatabaseX? = null

        fun getDatabase(context: Context): DatabaseX {
            val tempInstance = INSTANCE
            if (tempInstance != null) {
                return tempInstance
            }
            synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    DatabaseX::class.java,
                    "DatabaseX"
                ).build()
                INSTANCE = instance
                return instance
            }
        }
    }
}