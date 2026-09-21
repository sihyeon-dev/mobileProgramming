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
        week03Functions()
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

private fun week03Functions(){
//    println("Week 02: Functions")
//
    fun greet(name: String) = "Hello, $name!"

    println(greet("Android developer"))

    println("== Kotlin Functions ==")

//    fun greet(name: String): String { //변수명이 먼저 오고 그 뒤에 타입 또 그 뒤는 리턴타입. 즉 타입이 뒤에 붙음
//        return "Hello, $name!"
//    }

    fun add(a: Int, b: Int) = a + b //이런식으로 짧게도 가능

    fun introduce(name: String, age: Int = 19){ //디폴트 매개변수 값이 안들어오면 디폴트값으로 씀
        println("My name is $name and I'm $age years old")
    }

    println(greet("Kotlin"))
    println("Sum: ${add(5, -71)}")
    introduce("Kim", 7)
    introduce("Park")

    fun printALL(vip : Boolean, name : String){
        println("$vip, $name")
    }
    //printALL(vip:true, name:"dy")
    printALL(name = "mirae", vip = true) //인수를 지명함

    //가변인수
    fun printMany(vararg msg:String){
        for(m in msg) println(m)
    }

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