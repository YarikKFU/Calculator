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

    fun sqrt() {
        if (context is MainActivity) {
            if (context.math_operation.text.isNotEmpty()) {
                if (context.result_text.text.toString().isEmpty()) {
                    context.math_operation.text =
                        Math.sqrt(context.math_operation.text.toString().toDouble()).toString()
                } else {
                    context.math_operation.text =
                        Math.sqrt(context.result_text.text.toString().toDouble()).toString()
                    context.result_text.text = ""
                }
            }
        }
    }

    fun clear() {
        if (context is MainActivity) {
            context.math_operation.text = ""
            context.result_text.text = ""
        }
    }

    fun invert() {
        if (context is MainActivity) {
            if (context.math_operation.text.isNotEmpty()) {
                if (context.result_text.text.toString().isEmpty())
                    context.math_operation.text =
                        (context.math_operation.text.toString().toDouble() * (-1)).toString()
                else {
                    context.math_operation.text =
                        (context.result_text.text.toString().toDouble() * (-1)).toString()
                    context.result_text.text = ""
                }
            }
        }
    }

    fun delete() {
        if (context is MainActivity) {
            if (context.math_operation.text.isNotEmpty()) {
                val str = context.math_operation.text.toString()
                if (str.isNotEmpty()) {
                    context.math_operation.text = str.substring(0, str.length - 1)
                    context.result_text.text = ""
                }
            }
        }
    }
}