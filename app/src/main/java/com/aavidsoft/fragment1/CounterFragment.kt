package com.aavidsoft.fragment1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment

class CounterFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        var txtInfo = TextView(context)
        txtInfo.setTextSize(30F)
        txtInfo.setText("BitCode Technologies")

        return txtInfo
    }

}








