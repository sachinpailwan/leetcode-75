package com.kotlin.leetcode

fun main(){
    println("coding")
}

fun intersection(nums: Array<IntArray>): List<Int> {
    val common = HashSet<Int>()
    nums[0].toCollection(common)
    for (i in 1 until nums.size){
        val current = HashSet<Int>()
        nums[i].filter { i -> common.contains(i) }.toCollection(current)
        common.retainAll(current)
    }
    return common.sorted().toList()
}