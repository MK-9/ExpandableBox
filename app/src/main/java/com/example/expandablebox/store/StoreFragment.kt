package com.example.expandablebox.store

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.expandablebox.R
import com.example.expandablebox.base.BaseFragment
import com.example.expandablebox.databinding.FragmentStoreBinding
import com.example.model.response.StoreResponse
import com.example.utility.file.FileUtility
import com.google.gson.Gson
import java.io.*

class StoreFragment : BaseFragment() {

    private lateinit var binding: FragmentStoreBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentStoreBinding.inflate(inflater)

        val layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)

        with(binding) {
            try {
                val response =
                    FileUtility.readInputStream(requireActivity().resources.openRawResource(R.raw.response))
                val storeResponse = Gson().fromJson(response, StoreResponse::class.java)
                val adapter = StoreAdapter(storeResponse.storeItems)
                rcv.adapter = adapter

                rcv.layoutManager = layoutManager
            } catch (exception: IOException) {

            }
        }

        return binding.root
    }


}