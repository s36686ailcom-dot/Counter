package com.rus.counter.domain.model

data class Counter (
    val counter: Int,
    val typeOfCounter: TypeOfCounter= TypeOfCounter.NONE
    )

enum class TypeOfCounter{
    NONE,
    INCREMENT,
    DECREMENT
}