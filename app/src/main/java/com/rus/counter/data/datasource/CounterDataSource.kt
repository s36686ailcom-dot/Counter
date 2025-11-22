package com.rus.counter.data.datasource

import com.rus.counter.data.model.CounterDto

class CounterDataSource {


    private var counter = 0
    private var type = "none"
    fun increment() {
        counter++
        type = "increment"
    }
    fun decrement(){
        counter--
        type = "decrement"
    }
    fun getCounter() : CounterDto {
        return CounterDto(
            counter = counter,
            type = type
        )
    }


}