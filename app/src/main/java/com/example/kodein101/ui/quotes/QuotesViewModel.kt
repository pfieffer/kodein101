package com.example.kodein101.ui.quotes

import androidx.lifecycle.ViewModel
import com.example.kodein101.data.model.Quote
import com.example.kodein101.data.repository.QuoteRepository

class QuotesViewModel(private val quoteRepository: QuoteRepository) : ViewModel() {

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)

    fun getQuotes() = quoteRepository.getQuotes()
}