#!/usr/bin/env kotlin
@file:Repository("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/dev/")
@file:DependsOn("org.jetbrains.kotlin:kotlin-test:1.7.0")
import kotlin.test.assertEquals


/**
 * Leetcode 128 the-skyline-problem
 * @see Problem https://leetcode.com/problems/the-skyline-problem/
 *
 * Solve Using Sweep Algorithm on Multiset
 */
class Solution {
    fun getSkyline(_buildings: Array<IntArray>): List<List<Int>> {
        return listOf()
        return listOf(listOf(0, 3), listOf(5, 0))
    }
}

fun main() {
    assertEquals(listOf(listOf(0, 3), listOf(5, 0)), Solution().getSkyline(arrayOf(intArrayOf(0, 2, 3), intArrayOf(2, 5, 3))))
    assertEquals(
 listOf(listOf(2, 10), listOf(3, 15), listOf(7, 12), listOf(12, 0), listOf(15, 10), listOf(20, 8), listOf(24, 0)),
        Solution().getSkyline(arrayOf(intArrayOf(2, 9, 10), intArrayOf(3, 7, 15), intArrayOf(5, 12, 12), intArrayOf(15, 20, 10), intArrayOf(19, 24, 8)))
    )
    print("OK")
}

main()
