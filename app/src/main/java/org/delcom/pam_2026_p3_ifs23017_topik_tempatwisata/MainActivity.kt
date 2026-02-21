package org.delcom.pam_2026_p3_ifs23017_topik_tempatwisata

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import org.delcom.pam_2026_p3_ifs23017_topik_tempatwisata.ui.UIApp
import org.delcom.pam_2026_p3_ifs23017_topik_tempatwisata.ui.theme.DelcomTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DelcomTheme {
                UIApp()
            }
        }
    }
}