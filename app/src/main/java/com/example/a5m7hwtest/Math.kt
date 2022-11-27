package com.example.a5m7hwtest

class Math {
    fun add(a: String, b: String): String {
        var result = ""

        if (a.toIntOrNull() != null || b.toIntOrNull() != null) {
            val num1 = a.toInt()
            val num2 = b.toInt()
            result = (num1 + num2).toString()
        } else if (a.isEmpty() || b.isEmpty()) {
            result = "Вы не заполнили поле!"
        } else if (a.toDoubleOrNull() != null || b.toDoubleOrNull() != null) {
            result = (a.toDouble() + b.toDouble()).toString()
        } else if (a.toIntOrNull() == null || b.toIntOrNull() == null) {
            result = "Нельзя складывать буквы!"
        } else if (a.toInt() < 0 || b.toInt() < 0) {
            result = (a.toInt() + b.toInt()).toString()
        }
        return result
    }

    fun divide(a: String, b: String): String {
        var result = ""

        if (a.toIntOrNull() != null || b.toIntOrNull() != null) {
            val num1 = a.toInt()
            val num2 = b.toInt()
            result = (num1 / num2).toString()
        } else if (a.isEmpty() || b.isEmpty()) {
            result = "Вы не заполнили поле!"
        } else if (a.toDoubleOrNull() != null || b.toDoubleOrNull() != null) {
            result = (a.toDouble() / b.toDouble()).toString()
        } else if (a.toIntOrNull() == null || b.toIntOrNull() == null) {
            result = "Нельзя делить буквы!"
        } else if (a.toInt() < 0 || b.toInt() < 0) {
            result = (a.toInt() / b.toInt()).toString()
        }
        return result
    }

}