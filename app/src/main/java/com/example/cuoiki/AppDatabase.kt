package com.example.cuoiki

import androidx.room.Database
import androidx.room.RoomDatabase
import com.alterpat.budgettracker.Transaction

@Database(entities = arrayOf(Transaction::class), version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun transactionDao() : TransactionDao
}