package org.delcom.pam_2026_p3_ifs23017_topik_tempatwisata.ui

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import org.delcom.pam_2026_p3_ifs23017_topik_tempatwisata.helper.ConstHelper
import org.delcom.pam_2026_p3_ifs23017_topik_tempatwisata.ui.screens.HomeScreen
import org.delcom.pam_2026_p3_ifs23017_topik_tempatwisata.ui.screens.PlantsDetailScreen
import org.delcom.pam_2026_p3_ifs23017_topik_tempatwisata.ui.screens.PlantsScreen
import org.delcom.pam_2026_p3_ifs23017_topik_tempatwisata.ui.screens.ProfileScreen

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun UIApp(
    navController: NavHostController = rememberNavController(),
) {
    Scaffold { _ ->
        NavHost(
            navController = navController,
            startDestination = ConstHelper.RouteNames.Home.path,
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF7F8FA))

        ){
            // Home
            composable(
                route = ConstHelper.RouteNames.Home.path,
            ) { _ ->
                HomeScreen(
                    navController = navController,
                )
            }

            // Profile
            composable(
                route = ConstHelper.RouteNames.Profile.path,
            ) { _ ->
                ProfileScreen(
                    navController = navController,
                )
            }

            // Plants
            composable(
                route = ConstHelper.RouteNames.Plants.path,
            ) { _ ->
                PlantsScreen(
                    navController = navController,
                )
            }

            // Plants Detail
            composable(
                route = ConstHelper.RouteNames.PlantsDetail.path,
                arguments = listOf(
                    navArgument("name") { type = NavType.StringType },
                )
            ) { backStackEntry ->
                val plantName = backStackEntry.arguments?.getString("name") ?: ""

                PlantsDetailScreen(
                    navController = navController,
                    plantName = plantName
                )
            }
        }
    }

}