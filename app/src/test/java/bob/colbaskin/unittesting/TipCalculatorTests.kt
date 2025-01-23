package bob.colbaskin.unittesting


import org.junit.Test

import org.junit.Assert.*
import java.text.NumberFormat

class TipCalculatorTests {

    @Test
    fun calculateTip_20PercentNoRoundUp() {
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        val amount = 10.0
        val tipPercent = 20.0
        val actualTip = calculateTip(amount, tipPercent, false)

        assertEquals(expectedTip, actualTip)
    }

    @Test
    fun calculateTip_5PercentRoundUp() {
        val expectedTip = NumberFormat.getCurrencyInstance().format(1)
        val amount = 10.0
        val tipPercent = 5.0
        val actualTip = calculateTip(amount, tipPercent, true)

        assertEquals(expectedTip, actualTip)
    }
}