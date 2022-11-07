package com.example.homework4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.homework4.databinding.FragmentMainActivityBinding


class MainActivityFragment : Fragment() {
    private lateinit var binding:FragmentMainActivityBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentMainActivityBinding.inflate(inflater,container,false)



        binding.btnA.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.toA)
        }

        binding.btnX.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.toX)
        }

        return binding.root
    }


}