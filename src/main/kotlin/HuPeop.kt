package ru.netology

import java.lang.Exception
import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var valid = true
    var likes: String
    print("Введите количество лайков:\n>> ")
    do {
        likes = sc.nextLine()
        try {
            if (likes.toInt() < 0) throw Exception()
            valid = false
        } catch (e: Exception) {
            print("Введите целое число, и не меньше 0\n>> ")
        }
    } while (valid)
    println("Понравилось $likes ${typeDefine(likes)}")
}

fun typeDefine(likes: String): String {
    return if ((likes.endsWith("1")) &&
               (!likes.endsWith("11")))
                "человеку"
           else
                "людям"
}