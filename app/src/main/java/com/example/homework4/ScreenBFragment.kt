package com.example.homework4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.homework4.databinding.FragmentScreenABinding
import com.example.homework4.databinding.FragmentScreenBBinding

class ScreenBFragment : Fragment() {
    private lateinit var binding:FragmentScreenBBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentScreenBBinding.inflate(inflater,container,false)

        binding.btnY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.toY)
        }


        return binding.root
    }


}