package com.example.calculator

class Operation(private var first: Double, private val second: Double) {
    fun sum() = first + second
    fun dif() = first - second
    fun mult() = first * second
    fun div()= first / second
}