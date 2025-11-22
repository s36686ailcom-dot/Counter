package com.rus.counter.domain.usecases

import com.rus.counter.domain.repository.CounterRepository

class DecrementUseCase(private val repository: CounterRepository) {
    operator fun invoke() {
        repository.decrement()
    }
}