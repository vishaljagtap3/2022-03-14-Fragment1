package com.aavidsoft.fragment1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.aavidsoft.fragment1.databinding.MainActivity1Binding

class MainActivity1 : AppCompatActivity() {

    private lateinit var binding : MainActivity1Binding
    private var counterFragments = ArrayList<CounterFragment>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = MainActivity1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnAddFragment.setOnClickListener {
            var fragmentTransaction = supportFragmentManager.beginTransaction()

            var counterFragment = CounterFragment()
            counterFragments.add(counterFragment)

            //fragmentTransaction.add(counterFragment, CounterFragment::class.java.name)
            //fragmentTransaction.add(R.id.mainContainer, counterFragment, "counterFragment")
            fragmentTransaction.replace(R.id.mainContainer, counterFragment)
            fragmentTransaction.commit()
        }

        binding.btnRemoveFragment.setOnClickListener {

            if(counterFragments.size <= 0) {
                return@setOnClickListener
            }

            var fragmentTransaction = supportFragmentManager.beginTransaction()
            fragmentTransaction.remove(counterFragments[0])
            fragmentTransaction.commit()

            counterFragments.removeAt(0)
        }


    }

}