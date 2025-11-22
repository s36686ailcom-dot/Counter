package com.rus.counter.presentation.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.rus.counter.databinding.ActivityMainBinding
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private val viewModel : MainViewModel by viewModel()
    //private val viewModel by lazy { ViewModelProvider(this)[MainViewModel::class.java] }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.apply {

            viewModel.counter.observe(this@MainActivity) {
               counterTextView.text = it.counter.toString()
            }

            decrementButton.setOnClickListener {
                viewModel.decrement()
            }

            incrementButton.setOnClickListener {
                viewModel.increment()
            }
        }
    }
}