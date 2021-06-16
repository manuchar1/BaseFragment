package com.tbcacademy.basefragment.ui.home

import android.view.LayoutInflater
import android.view.ViewGroup
import com.tbcacademy.basefragment.base.BaseFragment
import com.tbcacademy.basefragment.databinding.FragmentHomeBinding

class HomeFragment : BaseFragment<FragmentHomeBinding, HomeViewModel>(FragmentHomeBinding::inflate) {

    override fun start(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = FragmentHomeBinding.inflate(inflater, container, false)

    override fun getViewModel() = HomeViewModel::class.java


}