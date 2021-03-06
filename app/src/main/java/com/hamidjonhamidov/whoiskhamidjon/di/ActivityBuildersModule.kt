package com.hamidjonhamidov.whoiskhamidjon.di

import com.hamidjonhamidov.whoiskhamidjon.di.blog_posts.BlogFragmentBuildersModule
import com.hamidjonhamidov.whoiskhamidjon.di.blog_posts.BlogModule
import com.hamidjonhamidov.whoiskhamidjon.di.blog_posts.BlogPostsScope
import com.hamidjonhamidov.whoiskhamidjon.di.blog_posts.BlogViewModelModule
import com.hamidjonhamidov.whoiskhamidjon.di.main.MainFragmentBuildersModule
import com.hamidjonhamidov.whoiskhamidjon.di.main.MainModule
import com.hamidjonhamidov.whoiskhamidjon.di.main.MainScope
import com.hamidjonhamidov.whoiskhamidjon.di.main.MainViewModelModule
import com.hamidjonhamidov.whoiskhamidjon.ui.main.MainActivity
import com.hamidjonhamidov.whoiskhamidjon.ui.posts.BlogPostsActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {

    @MainScope
    @ContributesAndroidInjector(
        modules = [MainModule::class, MainViewModelModule::class, MainFragmentBuildersModule::class]
    )
    abstract fun contributeMainActivity(): MainActivity


    @BlogPostsScope
    @ContributesAndroidInjector(
        modules = [BlogModule::class, BlogViewModelModule::class, BlogFragmentBuildersModule::class]
    )
    abstract fun contributeBlogPostsActivity(): BlogPostsActivity

    // here another scopes come
}