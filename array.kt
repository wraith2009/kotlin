package com.example.secoundproject

fun main() {
    var age = arrayOf(1, 2, 3)
    println("First element of array = " + age[0])
    println("Second element of array = " + age.get(1))
    println("Third element of array = " + age[2])

    /*
    to change the value of element we use set function:
     */
    age.set(1,8)
    println("second element now =" +age.get(1))
    /*
    to get the size of array :
     */
    println("Size of the array is = " + age.size)
}




