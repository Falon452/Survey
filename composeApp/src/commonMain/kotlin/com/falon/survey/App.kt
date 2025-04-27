package com.falon.survey

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.falon.survey.login.presentation.ui.LoginScreen
import com.falon.survey.splash.ui.SplashScreen
import com.falon.survey.theme.AppTheme
import org.koin.compose.KoinContext

@Composable
fun App() {
    KoinContext {
        val navController = rememberNavController()
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colorScheme.surface
        ) {
            AppTheme {
                NavHost(
                    navController = navController,
                    startDestination = Routes.SplashScreen,
                ) {
                    composable(route = Routes.SplashScreen) {
                        SplashScreen(navController)
                    }
                    composable(route = Routes.LoginScreen) {
                        LoginScreen(navController = navController)
                    }
                    composable(route = Routes.SurveyScreen) {

                    }
                }
            }
        }
    }
}
