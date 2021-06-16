package com.tbcacademy.basefragment.ui.dashboard

import android.view.LayoutInflater
import android.view.ViewGroup
import com.tbcacademy.basefragment.base.BaseFragment
import com.tbcacademy.basefragment.databinding.FragmentDashboardBinding

class DashboardFragment :
    BaseFragment<FragmentDashboardBinding, DashboardViewModel>(FragmentDashboardBinding::inflate) {

    override fun start(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = FragmentDashboardBinding.inflate(inflater, container, false)

    override fun getViewModel() = DashboardViewModel::class.java

}