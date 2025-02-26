import org.example.toRoman
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class RomanNumeralsKtTest {

    @Test
    fun `test int to roman`() {
        assertEquals("I", 1.toRoman())
        assertEquals("II", 2.toRoman())
        assertEquals("III", 3.toRoman())
        assertEquals("IV", 4.toRoman())
        assertEquals("V", 5.toRoman())
        assertEquals("VII", 7.toRoman())
        assertEquals("IX", 9.toRoman())
        assertEquals("XII", 12.toRoman())
        assertEquals("XIV", 14.toRoman())
        assertEquals("XIX", 19.toRoman())
        assertEquals("XXXIII", 33.toRoman())
        assertEquals("XXXIV", 34.toRoman())
        assertEquals("XCIX", 99.toRoman())
        assertEquals("CCIV", 204.toRoman())
        assertEquals("CMXCIX", 999.toRoman())
        assertEquals("MMMMCDXLIV", 4444.toRoman())
        assertEquals("MMMMCMXLIX", 4949.toRoman())
        assertEquals("MMMMMMMMMCDXCIV", 9494.toRoman())
        assertEquals("MMMMMMMMMCMXCIX", 9999.toRoman())
    }

    @Test
    fun `test wrong arguments`() {
        assertEquals(wrongArgumentText, (-1).toRoman())
        assertEquals(wrongArgumentText, 0.toRoman())
    }
}


const val wrongArgumentText = "Wrong argument!"
