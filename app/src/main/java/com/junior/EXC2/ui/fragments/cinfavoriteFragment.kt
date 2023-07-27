package com.junior.EXC2.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.junior.EXC2.databinding.FragmentCinfavoriteBinding
import com.junior.EXC2.model.getDatas


class cinfavoriteFragment : Fragment() {
    private lateinit var binding: FragmentCinfavoriteBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentCinfavoriteBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.rvCinefavList.adapter = RVCinefav(getDatas())
    }


}


