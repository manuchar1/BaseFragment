package com.tbcacademy.basefragment.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModel
import androidx.viewbinding.ViewBinding


/**Base fragment is added to the standard android bottom navigation template*/

typealias Inflate<T> = (LayoutInflater, ViewGroup?, Boolean) -> T

abstract class BaseFragment<B : ViewBinding, VM : ViewModel>(private val inflate: Inflate<B>) :
    Fragment() {

    var binding: B? = null

    protected lateinit var viewModel: ViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = inflate.invoke(inflater, container, false)
        return binding?.root
    }

    abstract fun start(inflater: LayoutInflater, container: ViewGroup?): B

    abstract fun getViewModel(): Class<VM>

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null

    }

}