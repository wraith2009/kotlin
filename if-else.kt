package com.example.secoundproject

fun main()
{
    print("please enter the number :")
    var number:Int = readLine()!!.toInt()

    if (number % 2 == 0){
        print("$number is even")
    }
    else{
        print("$number is odd")
    }
}
