package ru.netology

import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    print("Введите количество лайков:\n>> ")
    val likes = sc.nextLine()
    println("Понравилось $likes ${typeDefine(likes)}")
}

fun typeDefine(likes: String): String {
    return if ((likes.endsWith("1")) &&
               (!likes.endsWith("11")))
                "человеку"
           else
                "людям"
}