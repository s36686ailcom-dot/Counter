package com.rus.counter.data.repository

import com.rus.counter.data.datasource.CounterDataSource
import com.rus.counter.data.mapper.toCounter
import com.rus.counter.domain.model.Counter
import com.rus.counter.domain.repository.CounterRepository

class CounterRepositoryImpl (
    private var api : CounterDataSource
) : CounterRepository {


    override fun increment() {
        api.increment()
    }

    override fun decrement() {
        api.decrement()
    }

    override fun getCounter(): Counter {
        val dto = api.getCounter()
        return dto.toCounter()
    }
}