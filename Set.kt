package com.example.secoundproject

fun main()
{
    
    /*
    set doesn't allow duplication of elements in arraylist
     */
    var xyz = setOf<Any>("abc",1,2.4,'k',true,"abc")

    println(xyz.size)
    println(xyz.last())
}
