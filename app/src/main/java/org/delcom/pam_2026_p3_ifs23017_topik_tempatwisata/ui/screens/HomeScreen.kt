package org.delcom.pam_2026_p3_ifs23017_topik_tempatwisata.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import org.delcom.pam_2026_p3_ifs23017_topik_tempatwisata.ui.components.BottomNavComponent
import org.delcom.pam_2026_p3_ifs23017_topik_tempatwisata.ui.components.TopAppBarComponent
import org.delcom.pam_2026_p3_ifs23017_topik_tempatwisata.ui.theme.DelcomTheme

@Composable
fun HomeScreen(
    navController: NavHostController,
) {
    val colorScheme = MaterialTheme.colorScheme

    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                Brush.verticalGradient(
                    colors = listOf(
                        colorScheme.primary.copy(alpha = 0.15f),
                        colorScheme.background
                    )
                )
            )
    ) {
        // Top App Bar
        TopAppBarComponent(
            navController = navController,
            title = "Explore Indonesia ✈️",
            false
        )

        // Content
        Box(
            modifier = Modifier.weight(1f)
        ) {
            HomeUI()
        }

        // Bottom Nav
        BottomNavComponent(navController = navController)
    }
}

@Composable
fun HomeUI() {

    val colorScheme = MaterialTheme.colorScheme

    Column(
        modifier = Modifier.padding(top = 20.dp)
    ) {

        // Title Card
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            shape = RoundedCornerShape(24.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 6.dp),
            colors = CardDefaults.cardColors(
                containerColor = colorScheme.primaryContainer
            )
        ) {
            Text(
                style = MaterialTheme.typography.headlineMedium,
                text = "Temukan Destinasi Impianmu 🌍",
                fontWeight = FontWeight.Bold,
                color = colorScheme.onPrimaryContainer,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp)
            )
        }

        // Icon Row (Tema Wisata)
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {

            listOf("🏝️", "🏔️", "🏖️", "🏕️").forEach { emoji ->

                Card(
                    modifier = Modifier.padding(8.dp),
                    shape = RoundedCornerShape(20.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
                    colors = CardDefaults.cardColors(
                        containerColor = colorScheme.surfaceVariant
                    )
                ) {
                    Text(
                        style = MaterialTheme.typography.headlineLarge,
                        text = emoji,
                        color = colorScheme.onSurfaceVariant,
                        modifier = Modifier.padding(18.dp)
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true, name = "Light Mode")
@Composable
fun PreviewHomeUILight(){
    DelcomTheme(darkTheme = false) {
        HomeUI()
    }
}

@Preview(showBackground = true, name = "Dark Mode")
@Composable
fun PreviewHomeUIDark(){
    DelcomTheme(darkTheme = true) {
        HomeUI()
    }
}