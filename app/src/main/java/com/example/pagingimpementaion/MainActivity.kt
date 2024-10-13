package com.example.pagingimpementaion

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.navigation.compose.rememberNavController
import coil.annotation.ExperimentalCoilApi
import com.example.pagingimpementaion.navigation.SetupNavGraph
import com.example.pagingimpementaion.screens.welcome.SplashViewModel
import com.example.pagingimpementaion.ui.theme.PagingImpementaionTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import kotlin.math.log

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalCoilApi::class)
    @Inject
    lateinit var splashViewModel: SplashViewModel

    @OptIn(ExperimentalCoilApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        installSplashScreen().setKeepOnScreenCondition {
            !splashViewModel.isLoading.value
        }
        setContent {
            PagingImpementaionTheme {
                val screen by splashViewModel.startDestination
                Log.d("TAG", "onCreate: $screen")
                val navHostController = rememberNavController()
                SetupNavGraph(navHostController = navHostController, startDestination = screen)

            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PagingImpementaionTheme {

    }
}