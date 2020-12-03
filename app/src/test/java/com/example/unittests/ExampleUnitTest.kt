package com.example.unittests

import org.json.JSONObject
import org.junit.Test

import org.junit.Assert.*
import java.lang.invoke.MethodHandles

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun sum_is_Correct() {
        val classTest = ClassTest()
        val result = classTest.sum(6, 6)
        val expected = 5
        assertEquals(expected, result)
    }

    @Test
    fun Responce_not_Null()
    {
        val classTest = ClassTest()

        val result = classTest.getResponce("https://aws.random.cat/meow")

        var res: String? = null

        res = (JSONObject(result!!).get("file")).toString()

        assertNull(res)
    }
}