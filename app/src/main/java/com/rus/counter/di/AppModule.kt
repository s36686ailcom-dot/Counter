package com.rus.counter.di

import com.rus.counter.data.datasource.CounterDataSource
import com.rus.counter.data.repository.CounterRepositoryImpl
import com.rus.counter.domain.repository.CounterRepository
import com.rus.counter.domain.usecases.DecrementUseCase
import com.rus.counter.domain.usecases.GetCounterUseCase
import com.rus.counter.domain.usecases.IncrementUseCase
import com.rus.counter.presentation.activity.MainViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    factory { CounterDataSource() }
    single<CounterRepository> { CounterRepositoryImpl(get()) }

    factory { IncrementUseCase(get()) }
    factory { DecrementUseCase(get()) }
    factory { GetCounterUseCase(get()) }

    viewModel {
        MainViewModel (
            incrementUseCase = get(),
            decrementUseCase = get(),
            getCounterUseCase = get()
        )
    }
}