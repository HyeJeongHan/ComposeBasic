package com.example.composebasic

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composebasic.ui.theme.ComposeBasicTheme
import com.example.composebasic.ui.theme.Purple200
import com.example.composebasic.ui.theme.Purple500

class ComposeTest2Activity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        showToast()

        setContent {
            ShowToast()
        }
    }

    private fun showToast() {
        Toast.makeText(this@ComposeTest2Activity, "no compose text", Toast.LENGTH_SHORT).show()
    }


    @Composable
    private fun ShowToast() {
        Toast.makeText(this@ComposeTest2Activity, "compose text", Toast.LENGTH_SHORT).show()
    }
}

@Composable
fun Greeting2(name: String) {
    Scaffold(
        topBar = {

        },
        floatingActionButtonPosition = FabPosition.Center,
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }) {

            }
        }

    ) {


    }

}

@Composable
fun MyRowItem2() {
    Row(
        modifier = Modifier
            .background(Purple200),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = "hello world",
            color = Purple500,
            fontFamily = FontFamily.Serif
        )
        MyColumnItem()
    }
}

@Composable
fun MyColumnItem() {
    Column(
        modifier = Modifier.background(Color.Cyan),
        verticalArrangement = Arrangement.Center
    ) {
        MyBoxItem()
        Text(text = "Column text1", Modifier.padding(5.dp, 0.dp, 0.dp, 0.dp))
        Text(text = "Column text2")
        Text(text = "Column text3")
    }
}

@Composable
fun MyBoxItem() {
    Box {
        Image(
            painter = painterResource(id = R.drawable.img_test),
            contentDescription = "test_image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .padding(2.dp)
                .size(50.dp)
                .clip(CircleShape)
                .width(50.dp)
                .height(50.dp)
                .border(1.dp, Color.White, CircleShape)
        )
        Image(
            painter = painterResource(id = R.drawable.ic_launcher_foreground),
            contentDescription = "text_image",
            contentScale = ContentScale.Crop,
            modifier = Modifier.align(Alignment.BottomEnd)
                .width(20.dp)
                .clip(CircleShape)
                .height(20.dp)
                .border(1.dp, Color.Black, CircleShape)
        )
    }
}

@Preview
@Composable
fun ComposeTest2ActivityPreview() {
    ComposeBasicTheme {
        MyRowItem2()
    }
}
