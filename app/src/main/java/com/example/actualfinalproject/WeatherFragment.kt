package com.example.actualfinalproject

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.example.actualfinalproject.databinding.FragmentWeatherBinding
import java.net.URI


class WeatherFragment : Fragment() {

    private lateinit var binding: FragmentWeatherBinding


    interface OnFragmentInteractionListener {
        fun onFragmentInteraction(uri: URI)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentWeatherBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnBack.setOnClickListener{
            Navigation.findNavController(it).navigate(R.id.weatherToSearch)
        }
    }


}