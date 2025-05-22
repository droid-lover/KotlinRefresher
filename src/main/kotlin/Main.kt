package com.nmb

fun main() {

//    var fruit : Fruit? = null
//
//    fruit = Fruit(name = "Mango")

    lateinit var fruit : Fruit

    fruit = Fruit("apple")


}

class Fruit(val name: String)