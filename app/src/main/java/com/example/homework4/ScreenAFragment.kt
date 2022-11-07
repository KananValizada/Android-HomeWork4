package com.example.homework4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.homework4.databinding.FragmentScreenABinding

class ScreenAFragment : Fragment() {
    private lateinit var binding :FragmentScreenABinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentScreenABinding.inflate(inflater,container,false)

        binding.btnB.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.toB)
        }
        return binding.root
    }


}