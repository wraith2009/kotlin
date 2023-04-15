package com.example.objectorientedprogramming

fun main()
{
    var myCar = Cars()
    myCar.name = "Ferrari"
    myCar.model = 2021

    var myCar2 = Cars()
    myCar2.name = "Audi"
    myCar2.model = 2020

    println("my first car name is ${myCar.name} and its model is ${myCar.model}")
    println("my second car name is ${myCar2.name} and its model is ${myCar2.model}")
}
