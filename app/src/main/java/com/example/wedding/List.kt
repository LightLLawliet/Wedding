package com.example.wedding

import android.os.Bundle
import android.transition.TransitionInflater
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class List : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    class FragmentA : Fragment() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            val inflater = TransitionInflater.from(requireContext())
            exitTransition = inflater.inflateTransition(R.transition.fade)
        }
    }

    class FragmentB : Fragment() {
        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            val inflater = TransitionInflater.from(requireContext())
            enterTransition = inflater.inflateTransition(R.transition.slide_right)
        }
    }
}