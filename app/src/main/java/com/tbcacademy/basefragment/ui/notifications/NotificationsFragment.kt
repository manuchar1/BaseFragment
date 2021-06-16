package com.tbcacademy.basefragment.ui.notifications

import android.view.LayoutInflater
import android.view.ViewGroup
import com.tbcacademy.basefragment.base.BaseFragment
import com.tbcacademy.basefragment.databinding.FragmentNotificationsBinding

class NotificationsFragment :
    BaseFragment<FragmentNotificationsBinding, NotificationsViewModel>(FragmentNotificationsBinding::inflate) {

    override fun start(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = FragmentNotificationsBinding.inflate(inflater, container, false)

    override fun getViewModel() = NotificationsViewModel::class.java
}