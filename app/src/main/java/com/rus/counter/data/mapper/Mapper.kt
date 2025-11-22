package com.rus.counter.data.mapper

import com.rus.counter.data.model.CounterDto
import com.rus.counter.domain.model.Counter
import com.rus.counter.domain.model.TypeOfCounter

fun String.toTypeOfCounter(): TypeOfCounter {
    return when (this) {
        "increment" ->  TypeOfCounter.INCREMENT
        "decrement" ->  TypeOfCounter.DECREMENT
        else ->  TypeOfCounter.NONE

    }
}
fun CounterDto.toCounter(): Counter {
    return Counter(
        counter = counter,
        typeOfCounter = type.toTypeOfCounter()
    )
}