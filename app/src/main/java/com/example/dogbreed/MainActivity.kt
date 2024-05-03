package com.example.dogbreed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ReportFragment.Companion.reportFragment
import com.example.dogbreed.details.DogDetailFragment
import com.example.dogbreed.databinding.ActivityMainBinding
import com.example.dogbreed.databinding.FragmentDogListBinding

// When ever I make a fragment it also make a shopping
// it wont let me make .example.dogbreed

class MainActivity : AppCompatActivity() {

    lateinit var main: ActivityMainBinding
    lateinit var dogDetail: DogDetailFragment
    private var _binding: FragmentDogListBinding? = null

    private val binding get() = _binding!!


     fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDogListBinding.inflate(inflater, container, false)
        val root: View = binding.root
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dog_list, container, false)

    }
}
