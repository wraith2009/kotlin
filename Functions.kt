package com.example.secoundproject

fun main()
{
    /*
    fun addNumber( x:Int , y:Int ) :Int{
           ^          ^              ^
           !          !              !
    functionName   parameters       ReturnType
    }
     */

    print("please enter the first number :")
    var number1:Int = readLine()!!.toInt()

    print("please enter the second number :")
    var number2:Int = readLine()!!.toInt()

    show(number1,number2)
    var a=add(number1,number2)
    print("sum of number1 + number2 : $a")
    var b=findMinimunNumber(number1,number2)
    print("minimum number is : $b")
}
fun show(num1:Int ,num2:Int)
{
    println("you entered $num1 and $num2")
}

fun add(num1:Int , num2: Int) :Int
{
    var sum:Int =0
    sum = num1 + num2
    return  sum
}

fun findMinimunNumber(num1: Int,num2: Int) :Int
{
    var minimun:Int = 0
    if (num1 > num2){
        println("num 2 is smaller")
        minimun = num2
    }else{
        println(" num 1 is smaller")
        minimun = num1
    }
    return  minimun
}
