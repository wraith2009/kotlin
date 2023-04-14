package com.example.secoundproject

fun main()
{
    print(" please enter your age :")
    var age:Int = readLine()!!.toInt()

    if(age < 13){
        print("you are an child. ")

    }
    else if (age < 13){
        print("you are an teenager .")
    }
    else{
        if (age < 65){
            print("you are an adult")
        }else{
            print("you are an old man .")
        }
    }

}
