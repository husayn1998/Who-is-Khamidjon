package com.hamidjonhamidov.whoiskhamidjon.ui

interface MainMenuItemsClicked {
    fun onAboutMeClicked()

    fun onSkillsClicked()

    fun onPersonalProjectsClicked()

    fun onSourceCodeClicked()

    fun onAboutAppClicked()

    fun onPersonalPostsClicked()

    // this is unnecessary as it exits the app
    fun onContactMeClicked()
}