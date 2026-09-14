package com.kotlinbasicsjetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.kotlinbasicsjetpack.ui.theme.KotlinBasicsJetpackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            KotlinBasicsJetpackTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
        week03Variables()
    }
}

private fun week03Variables() {
    println("Week 03 : Variables")

    val courseName = "MobileProgramming" //java final
    //courseName = "Data Stru" /error
    var week = 2
    week = 3
    println("Course : $courseName")
    println("week : $week")

    println("========Kotlin variables ========")

    //val (immutable) vs (mutable)
    val name = "Android"
    var version = 8

    println("Hi $name $version")

    val age: Int = 24
    val height: Double = 177.7
    val isStudent: Boolean = false

    println("Age :$age Height : $height Student: $isStudent")

    //var nickname:String = null
    var nickname:String? = null  //?를 써서 null 할당 가능
    nickname = "mirae"
    println("Nickname : $nickname ${nickname?.length}") //null할당가능 변수 ? 붙임
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    KotlinBasicsJetpackTheme {
        Greeting("Android")
    }
}