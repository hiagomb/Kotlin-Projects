package com.example.udemykotlincourse

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {


    @Test
    fun countCharTest(){
        assertEquals(5, countChar("Hiago"))
    }

    @Test
    fun cubeNumTest(){
        assertEquals(27, cubeNum(3))
    }


    @Test
    fun convertMilesTest(){
        assertEquals(16.0, convertMiles(10.0), 0.0)
    }
}