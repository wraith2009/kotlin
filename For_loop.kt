package com.example.secoundproject

fun main()
{

   /*     1. -> for (number in 1..10)
    {
        println(number)
    }*/

   /*      2. ->var sum:Int = 0
    for (x in 0..10)
    {
        println(x)
        if (x % 2==0) {
            sum += x
        }
    }
    println("Sum of numbers :" + sum)
    */

   /*       3. ->var myNumberArray = arrayListOf<Int>(1,2,3,4,5,20,7,8,9)
    for (y in 0..myNumberArray.indices)
    {
        println("myNumberArray[$y] = ${myNumberArray[y]}" )
    }


    // for each loop
    println("----------------------------------------------------")*/
    var myNumberArray = arrayListOf<Int>(1,2,3,4,5,20,7,8,9)
    myNumberArray.forEach{ println(it)}
}



