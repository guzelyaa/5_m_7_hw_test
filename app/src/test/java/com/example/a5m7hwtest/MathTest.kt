package com.example.a5m7hwtest

import junit.framework.Assert.assertEquals
import org.junit.After
import org.junit.Before
import org.junit.Test

class MathTest {

    var math: Math? = null

    @Before
    fun install() {
        math = Math()
    }

    @Test
    fun simpleAdd() {
        assertEquals("6", math?.add("3", "3"))
    }

    @Test
    fun checkEmpty() {
        assertEquals("Вы не заполнили поле!", math?.add("", "4"))
    }

    @Test
    fun checkNumber() {
        assertEquals("Нельзя складывать буквы!", math?.add("ываыаы", "аывпып"))
    }

    @Test
    fun dotAddCade(){
        assertEquals("4.0", math?.add("2.0", "2.0"))
    }

    @Test
    fun negativeAddCase(){
        assertEquals("Нельзя складывать отрицательные числа!", math?.add("-2", "-2"))
    }

    @After
    fun detach() {
        math = null
    }
}