package com.example.pagingimpementaion.navigation

sealed class Screen(val route: String) {
    data object Welcome: Screen(route = "welcome_screen")
    data object Home:Screen(route = "home_screen")
    data object Search:Screen(route = "search_screen")

}