package com.example.kodein101

import android.app.Application
import com.example.kodein101.data.db.Database
import com.example.kodein101.data.db.DatabaseFakeImpl
import com.example.kodein101.data.db.QuoteDao
import com.example.kodein101.data.repository.QuoteRepository
import com.example.kodein101.data.repository.QuoteRepositoryImpl
import com.example.kodein101.ui.quotes.QuotesViewModelFactory
import org.kodein.di.Kodein
import org.kodein.di.KodeinAware
import org.kodein.di.generic.bind
import org.kodein.di.generic.instance
import org.kodein.di.generic.provider
import org.kodein.di.generic.singleton

/*
Dependency Injection will be done here
 */
class QuotesApplication : Application(), KodeinAware {
    /*
    This ensures that Database once instantiated does not have to be re-instantiated. It will simply
    return previously instantiated database because its a singleton
     */
    override val kodein = Kodein.lazy {
        bind<Database>() with singleton {
            DatabaseFakeImpl() //DatabaseProductionImpl can be used once in Production mode (Just some possibility)
        }
        bind<QuoteDao>() with singleton {
            instance<Database>().quoteDao
        }
        bind<QuoteRepository>() with singleton {
            QuoteRepositoryImpl(instance()) //instance() here passes QuoteDao above to this QuoteRepositoryImpl
        }
        //with "provider" we are getting new instance, each time we request the instance
        bind() from provider {
            QuotesViewModelFactory(instance())
        }
    }
}