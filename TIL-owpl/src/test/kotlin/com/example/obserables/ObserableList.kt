package com.example.obserables

import kotlin.properties.Delegates

fun main() {
    var list by Delegates.observable(listOf<String>()) { _, old, new ->
        println("$old to $new")
    }

    list += listOf("hello", "world")
    list += listOf("kotlin")
}