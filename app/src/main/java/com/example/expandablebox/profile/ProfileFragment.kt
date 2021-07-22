package com.example.expandablebox.profile

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.expandablebox.base.BaseFragment
import com.example.expandablebox.databinding.FragmentProfileBinding


class ProfileFragment :BaseFragment() {

    private lateinit var binding: FragmentProfileBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentProfileBinding.inflate(inflater)


        return binding.root
    }
}