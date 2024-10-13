package com.example.pagingimpementaion

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import coil.annotation.ExperimentalCoilApi
import com.example.pagingimpementaion.navigation.SetupNavGraph
import com.example.pagingimpementaion.ui.theme.PagingImpementaionTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalCoilApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PagingImpementaionTheme {
                val navHostController = rememberNavController()
                SetupNavGraph(navHostController = navHostController)

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