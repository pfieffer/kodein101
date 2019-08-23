package com.example.kodein101.data.db


// If using Room, this is gonna be an Abstrct Class
interface Database {
    val quoteDao: QuoteDao
}