package com.example.actualfinalproject

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.net.URI

class MainActivity : AppCompatActivity(), WeatherFragment.OnFragmentInteractionListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        }


    override fun onFragmentInteraction(uri: URI) {
        TODO("Not yet implemented")
    }
}