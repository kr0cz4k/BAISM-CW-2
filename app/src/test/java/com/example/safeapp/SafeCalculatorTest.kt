
package com.example.safeapp

import org.junit.Test
import org.junit.Assert.*

class SafeCalculatorTest {

    @Test
    fun addTwoNumbers_returnsCorrectSum() {
        val result = SafeCalculator.add(2, 3)
        assertEquals(5, result)
    }

    @Test
    fun positiveNumber_returnsTrue() {
        val result = SafeCalculator.isPositive(10)
        assertTrue(result)
    }
}
