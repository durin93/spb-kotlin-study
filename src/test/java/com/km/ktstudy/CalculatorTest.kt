package com.km.ktstudy

import com.km.ktstudy.domain.Calculator
import org.hamcrest.CoreMatchers.`is`
import org.junit.Assert.assertThat
import org.junit.Test

class CalculatorTest {

    val calculator = Calculator()


    @Test
    fun plus() {

        assertThat(calculator.plus(1, 2), `is`(3))

    }

    @Test
    fun minus() {
        assertThat(calculator.minus(5, 2), `is`(3))
    }


}