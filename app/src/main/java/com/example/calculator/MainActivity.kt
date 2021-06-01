package com.example.calculator

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_0.setOnClickListener { CalcHelper(this).addDigit("0") }
        btn_1.setOnClickListener { CalcHelper(this).addDigit("1") }
        btn_2.setOnClickListener { CalcHelper(this).addDigit("2") }
        btn_3.setOnClickListener { CalcHelper(this).addDigit("3") }
        btn_4.setOnClickListener { CalcHelper(this).addDigit("4") }
        btn_5.setOnClickListener { CalcHelper(this).addDigit("5") }
        btn_6.setOnClickListener { CalcHelper(this).addDigit("6") }
        btn_7.setOnClickListener { CalcHelper(this).addDigit("7") }
        btn_8.setOnClickListener { CalcHelper(this).addDigit("8") }
        btn_9.setOnClickListener { CalcHelper(this).addDigit("9") }

        dot_btn.setOnClickListener { CalcHelper(this).addDigit(".") }
        minus_btn.setOnClickListener { CalcHelper(this).addDigit("-") }
        plus_btn.setOnClickListener { CalcHelper(this).addDigit("+") }
        mult_btn.setOnClickListener { CalcHelper(this).addDigit("*") }
        division_btn.setOnClickListener { CalcHelper(this).addDigit("/") }

        sqrt_btn.setOnClickListener { CalcHelper(this).sqrt() }
        clear_btn.setOnClickListener { CalcHelper(this).clear() }
        invert_btn.setOnClickListener { CalcHelper(this).invert() }
        delete_btn.setOnClickListener { CalcHelper(this).delete() }

        equal_btn.setOnClickListener { CalcHelper(this).res() }
    }
}