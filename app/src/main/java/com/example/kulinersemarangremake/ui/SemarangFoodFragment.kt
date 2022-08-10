package com.example.kulinersemarangremake.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.kulinersemarangremake.R
import com.example.kulinersemarangremake.databinding.FragmentSemarangFoodBinding

class SemarangFoodFragment : Fragment() {
    private var _semarangFoodBinding:FragmentSemarangFoodBinding?=null
    private val semarangFoodBinding get() = _semarangFoodBinding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _semarangFoodBinding= FragmentSemarangFoodBinding.inflate(inflater,container,false)
        return semarangFoodBinding.root
    }

    companion object {

    }
}