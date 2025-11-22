package com.rus.counter.domain.usecases

import com.rus.counter.domain.model.Counter
import com.rus.counter.domain.repository.CounterRepository

class GetCounterUseCase(private val repository: CounterRepository) {
    operator fun invoke(): Counter {
        return repository.getCounter()
    }
}