package com.aavidsoft.fragment1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.aavidsoft.fragment1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var counterFragment1: CounterFragment
    private lateinit var counterFragment2: CounterFragment
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        init()

        binding.btnReset.setOnClickListener {
            counterFragment1.resetCount(binding.edtCount.text.toString().toInt())
            counterFragment2.resetCount(binding.edtCount.text.toString().toInt())
        }
    }

    private fun init() {

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //var fragmentManager = supportFragmentManager
        counterFragment1 = supportFragmentManager.findFragmentById(R.id.counterFragment1) as CounterFragment
        counterFragment2 = supportFragmentManager.findFragmentById(R.id.counterFragment2) as CounterFragment
    }
}