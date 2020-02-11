package com.hamidjonhamidov.whoiskhamidjon.ui.main

import com.bumptech.glide.RequestManager
import com.hamidjonhamidov.whoiskhamidjon.util.ViewModelProviderFactory

interface MainDependencyProvider {
    fun getVMProviderFactory(): ViewModelProviderFactory

    fun getGlideRequestManager(): RequestManager
}