package com.example.secoundproject

import kotlin.random.Random

fun main()
{
    /* 1. -> var i:Int = 5
    while (i > 0)
    {
        println(i)
        i--
    }*/

   /* 2. -> var fact:Int=1
    var k =1
    while (k < 9){
        fact *=k //fact=fact*k
        println("$k! = $fact")
        k++
    }*/

    // Infinite loop

    val number  =Random.nextInt(0,100)
    println("Print enter the number : ")

    while (2 > 1)
    {
        val userGuess:Int = readLine()!!.toInt()
        if(userGuess  == number)
        {
            println("Congratulation, you know the number in my mind")
            break
        }
        else if (userGuess < number)
        {
            println("Increase your guess")
        }
        else
        {
            println("Decrese your guess")
        }
    }
}
