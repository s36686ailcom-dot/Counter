package com.rus.counter.domain.repository

import com.rus.counter.domain.model.Counter

interface CounterRepository {
    fun increment()
    fun decrement()
    fun getCounter() : Counter
}