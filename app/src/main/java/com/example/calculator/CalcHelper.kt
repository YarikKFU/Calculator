package com.example.calculator

import android.content.Context
import kotlinx.android.synthetic.main.activity_main.*

class CalcHelper(
    private val context: Context
) {
    fun addDigit(str: String) {
        if (context is MainActivity) {
            if (context.result_text.text != "") {
                context.math_operation.text = context.result_text.text
                context.result_text.text = ""
            }
            context.math_operation.append(str)
        }
    }
}