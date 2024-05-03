package com.example.dogbreed.List

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.dogbreed.R
import com.example.dogbreed.databinding.FragmentDogListBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

class DogListFragment : Fragment() {
    private var _binding: FragmentDogListBinding? = null

    private val binding get() = _binding!!


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentDogListBinding.inflate(inflater, container, false)
        val root: View = binding.root
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_dog_list, container, false)
    }


}