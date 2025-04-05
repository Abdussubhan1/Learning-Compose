package com.example.learningcompose

import android.graphics.drawable.shapes.Shape
import androidx.compose.material.icons.filled.*
import androidx.compose.material.icons.outlined.*

import android.os.Bundle
import android.provider.CalendarContract.Colors
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.automirrored.outlined.Send
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.rounded.Face
import androidx.compose.material.icons.rounded.FavoriteBorder
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField

import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors

import androidx.compose.runtime.Composable

import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.res.colorResource

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardCapitalization
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.sp
import androidx.core.text.isDigitsOnly
import androidx.lint.kotlin.metadata.Visibility


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FacebookLoginPage()
        }
    }
}

@Composable
fun FacebookLoginPage() {
    var userName by remember {
        mutableStateOf("")
    }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0XFF12222e)), contentAlignment = Alignment.Center
    ) {
        Column(horizontalAlignment = Alignment.CenterHorizontally) {
            Box(
                modifier = Modifier
                    .background(color = Color.White)
                    .clip(shape = RoundedCornerShape(200.dp))
                    .size(85.dp),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.facebook),
                    contentDescription = "Facebook logo",
                    modifier = Modifier.size(80.dp),
                    colorFilter = ColorFilter.tint(Color(0XFF1677ef))

                )
            }
            Spacer(modifier = Modifier.height(70.dp))
            TextField(
                value = userName,
                onValueChange = { userName = it },
                modifier = Modifier.width(320.dp),
                placeholder = { Text(text = "Mobile number or email address") })
            Spacer(modifier = Modifier.height(10.dp))
            TextField(
                value = userName,
                onValueChange = { userName = it },
                modifier = Modifier.width(320.dp),
                placeholder = { Text(text = "Password") })
            Spacer(modifier = Modifier.height(10.dp))
            Button(
                onClick = {},
                modifier = Modifier.width(320.dp),
                colors = ButtonDefaults.buttonColors(Color(0XFF1677ef))
            ) {
                Text(text = "Log In", fontSize = 16.sp)
            }
            Spacer(modifier = Modifier.height(30.dp))
            Text(
                text = "Forgotten Password?",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 16.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.width(320.dp)
            )
            Spacer(modifier = Modifier.height(150.dp))
            OutlinedButton(
                onClick = {},
                modifier = Modifier.width(320.dp),
                shape = RoundedCornerShape(50.dp),
                border = BorderStroke(2.dp, color = Color(0xFF1677EF)),
                colors = ButtonDefaults.outlinedButtonColors(contentColor = Color(0XFF1677ef))
            ) { Text(text = "Create new account") }
            Spacer(modifier = Modifier.height(30.dp))
            Row(
                modifier = Modifier.width(140.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Image(
                    modifier = Modifier.size(40.dp),
                    colorFilter = ColorFilter.tint(Color(0XFFc1d0d8)),
                    painter = painterResource(id = R.drawable.meta),
                    contentDescription = "Meta icon"
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(text = "Meta", color = Color(0XFFc1d0d8), fontSize = 20.sp)

            }


        }


    }

}


@Preview(showBackground = true)
@Composable
fun FirstAppPreview() {
    FacebookLoginPage()
}