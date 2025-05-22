package com.nmb

fun main() {

    val fruit by lazy {
        Fruit("Apple")
    }

    println(fruit)
}

class Fruit(val name: String){

}