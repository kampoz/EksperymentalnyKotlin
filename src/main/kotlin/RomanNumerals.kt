package org.example

import kotlin.time.Duration.Companion.seconds


/**
 * this function converts ints to roman numerals in recursive way
 *
 * @cache - needed only for caching during recursion, do not use
 * */
fun Int.toRoman(cache: String = ""): String {
    var result = cache
    var number: Int = this
    return if (number == 0) {
        result
    } else {
        for ((key, value) in numbersPairs) {
            if ((number - key) >= 0) {
                result += value
                number -= key
                break
            }
        }
        number.toRoman(result)
    }
}


private val numbersPairs = listOf(
    Pair(1000, "M"),
    Pair(900, "CM"),
    Pair(500, "D"),
    Pair(400, "CD"),
    Pair(100, "C"),
    Pair(90, "XC"),
    Pair(50, "L"),
    Pair(40, "XL"),
    Pair(10, "X"),
    Pair(9, "IX"),
    Pair(5, "V"),
    Pair(4, "IV"),
    Pair(1, "I")
)

//private val numbersPairs: LinkedHashMap<Int, String> = linkedMapOf(
//    1000 to "M", 900 to "CM", 500 to "D", 400 to "CD",
//    100 to "C", 90 to "XC", 50 to "L", 40 to "XL",
//    10 to "X", 9 to "IX", 5 to "V", 4 to "IV", 1 to "I")