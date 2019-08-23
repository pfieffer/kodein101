package com.example.kodein101.data.repository

import com.example.kodein101.data.db.QuoteDao
import com.example.kodein101.data.model.Quote

class QuoteRepositoryImpl(private val quoteDao: QuoteDao) : QuoteRepository {
    override fun addQuote(quote: Quote) {
        quoteDao.addQuote(quote)
    }

    override fun getQuotes() = quoteDao.getQuotes()

}