package com.example.kodein101.data.db

import androidx.lifecycle.LiveData
import com.example.kodein101.data.model.Quote

interface QuoteDao {
    fun addQuote(quote: Quote)
    fun getQuotes(): LiveData<List<Quote>>
}