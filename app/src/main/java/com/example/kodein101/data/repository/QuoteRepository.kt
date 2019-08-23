package com.example.kodein101.data.repository

import androidx.lifecycle.LiveData
import com.example.kodein101.data.model.Quote

interface QuoteRepository {
    fun addQuote(quote: Quote)
    fun getQuotes(): LiveData<List<Quote>>
}