package com.example.expandablebox.store

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.expandablebox.base.BaseFragment
import com.example.expandablebox.databinding.FragmentStoreBinding

class StoreFragment : BaseFragment() {

    private lateinit var binding: FragmentStoreBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentStoreBinding.inflate(inflater)


        return binding.root
    }


}