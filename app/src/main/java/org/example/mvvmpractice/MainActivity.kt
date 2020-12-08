package org.example.mvvmpractice

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewModel = ViewModelProvider(this, defaultViewModelProviderFactory).get(MainActivityViewModel::class.java)

        btnPlus.setOnClickListener {
            viewModel.incrementCount()
        }

        btnMinus.setOnClickListener {
            viewModel.decrementCount()
        }

        viewModel.counter.observe(this, { counter ->
            tvCount.text = counter.toString()
        })
    }
}