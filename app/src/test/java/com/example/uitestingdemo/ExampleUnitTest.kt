package com.example.uitestingdemo

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    private val mainActivity = MainActivity()

    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun testAdditionFunction(){
        val sum = mainActivity.doAddition(10,30)
        assertEquals(sum,40)
    }


}
