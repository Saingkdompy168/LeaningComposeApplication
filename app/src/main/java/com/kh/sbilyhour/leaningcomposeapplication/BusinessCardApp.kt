package com.kh.sbilyhour.leaningcomposeapplication

import android.graphics.Paint
import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp
import com.kh.sbilyhour.leaningcomposeapplication.ui.theme.LeaningComposeApplicationTheme

class BusinessCardApp : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LeaningComposeApplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {

                }
            }
        }
    }
}

@Composable
fun BusinessCardLayout() {
    val image= painterResource(id = R.drawable.ic_launcher_background)
    CustomComposeCenter(image,"Jennifer Does","Android Developer Extraordinaire")
}

@Composable
fun CustomComposeCenter(image: Painter, title: String, desc: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Image(painter = image, contentDescription = null)
        Text(text = title, fontSize = 20.sp)
        Text(text = desc, fontSize = 12.sp, color = Color(0xFF3ddc84))
    }
}


@Preview(showBackground = true)
@Composable
fun ComposeBusinessAppPreview() {
    LeaningComposeApplicationTheme {
        BusinessCardLayout()
    }
}