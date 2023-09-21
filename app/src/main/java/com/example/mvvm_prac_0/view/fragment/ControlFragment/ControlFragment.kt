package com.example.mvvm_prac_0.view.fragment.ControlFragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.mvvm_prac_0.R
import com.example.mvvm_prac_0.`interface`.OnClickListener
import com.example.mvvm_prac_0.view.viewmodel.MedalViewModel


class ControlFragment : Fragment(), OnClickListener {

    lateinit var mMedalViewModel: MedalViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         val view = inflater.inflate(R.layout.fragment_control, container, false)

        mMedalViewModel = ViewModelProvider.of(requireActivity()).get(MedalViewModel::class.java)
        // Inflate the layout for this fragment
        return view
    }

    override fun onClick(v: View?) {

    }


}