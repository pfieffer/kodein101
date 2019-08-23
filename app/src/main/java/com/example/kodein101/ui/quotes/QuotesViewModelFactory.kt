package com.example.kodein101.ui.quotes

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.kodein101.data.repository.QuoteRepository

/*
Thi factory will create instances of QuotesViewModel
 */
class QuotesViewModelFactory(private val quotesRepository: QuoteRepository) :
    ViewModelProvider.NewInstanceFactory() {

    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return QuotesViewModel(quotesRepository) as T
    }

}