package com.example.expandablebox.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.expandablebox.base.BaseFragment
import com.example.expandablebox.databinding.FragmentSearchBinding

class SearchFragment :BaseFragment() {

    private lateinit var binding: FragmentSearchBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentSearchBinding.inflate(inflater)


        return binding.root
    }
}