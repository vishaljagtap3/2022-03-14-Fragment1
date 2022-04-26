package com.aavidsoft.fragment1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.aavidsoft.fragment1.databinding.CounterLayoutBinding

class CounterFragment : Fragment() {

    private lateinit var binding: CounterLayoutBinding
    var count = 0

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = CounterLayoutBinding.inflate(layoutInflater)
        binding.txtCount.setText("${count}")

        binding.btnMinus.setOnClickListener {
            binding.txtCount.setText("${--count}")
        }

        binding.btnPlus.setOnClickListener {
            binding.txtCount.setText("${++count}")
        }

        return binding.root
    }

    fun resetCount(count : Int = 0) {
        this.count = count
        binding.txtCount.setText("$count")
    }

}








