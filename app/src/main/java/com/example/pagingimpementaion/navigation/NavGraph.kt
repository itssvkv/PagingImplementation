package com.example.pagingimpementaion.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.paging.ExperimentalPagingApi
import coil.annotation.ExperimentalCoilApi
import com.example.pagingimpementaion.screens.home.HomeScreen
import com.example.pagingimpementaion.screens.search.SearchScreen
import com.example.pagingimpementaion.screens.welcome.WelcomeScreen

@ExperimentalCoilApi
@OptIn(ExperimentalPagingApi::class)
@Composable
fun SetupNavGraph(
    navHostController: NavHostController,
    startDestination: String

) {
    NavHost(
        navController = navHostController,
        startDestination = startDestination
    )
    {
        composable(
            route = Screen.Welcome.route
        ) {
            WelcomeScreen(navHostController = navHostController)
        }
        composable(
            route = Screen.Home.route
        ) {
            HomeScreen(navHostController = navHostController)
        }
        composable(
            route = Screen.Search.route
        ) {
            SearchScreen(navHostController = navHostController)
        }
    }
}