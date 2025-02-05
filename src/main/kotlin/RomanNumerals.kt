package org.example


/**
 * this function converts ints to roman numerals in recursive way
 *
 * @cache - needed only for caching during recursion, do not use
 * */
fun Int.toRoman(cache: String = ""): String {
    var result = cache
    var number = this
    return if (number == 0) {
        result
    } else {
        for (i in numbersPairs.indices) {
            if (number - numbersPairs[i].first >= 0) {
                result += numbersPairs[i].second
                number -= numbersPairs[i].first
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