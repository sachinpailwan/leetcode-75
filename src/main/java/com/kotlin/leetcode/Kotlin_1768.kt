package com.kotlin.leetcode

fun main() {
    println(mergeAlternately("ab","pqrs"))
}

fun mergeAlternately(word1: String, word2: String): String {
    return IntRange(0, arrayOf(word1.length, word2.length).max()).map { i ->
        word1.getCharAtElse(i).plus(" " .plus(word2.getCharAtElse(i)))
    }.joinToString(" ") { s -> s}
}
fun String.getCharAtElse(i:Int):String = if (i<this.length) this.get(i).toString() else " "