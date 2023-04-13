package com.example.secoundproject

fun main()
 {
     /*
     normal declaration of ArrayList:
      */
    var age = ArrayList<Int>()

     /*
     addition of elements :
      */
    age.add(4)

    age.add(3)
    age.add(2,2)
    age.add(3,1)

     /*
     different types of printing elements:
      */
    println("First element of array is =" +age[0] )
    println("Second element of array is =" +age.get(1) )
    println("Third element of array is =" +age.get(2) )
    println("Fourth element of array is = ${age[3]}" )

    println("----------------------------------------------")

     /*
     for removing element from array:
      */
    age.remove(3)
    println("First element of array is =" +age[0] )
    println("Second element of array is =" +age.get(1) )
    println("Third element of array is =" +age.get(2) )

    /*
    If we want to add various elements of diff datatypes we can use "<any>":
    example: var diff = ArrayList<any>() 
     */

}
