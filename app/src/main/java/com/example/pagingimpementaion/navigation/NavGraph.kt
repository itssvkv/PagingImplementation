package com.example.pagingimpementaion.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.paging.ExperimentalPagingApi
import coil.annotation.ExperimentalCoilApi
import com.example.pagingimpementaion.screens.home.HomeScreen
import com.example.pagingimpementaion.screens.search.SearchScreen

@ExperimentalCoilApi
@OptIn(ExperimentalPagingApi::class)
@Composable
fun SetupNavGraph(
    navHostController: NavHostController
) {
    NavHost(
        navController = navHostController,
        startDestination = Screen.Home.route
    )
    {
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