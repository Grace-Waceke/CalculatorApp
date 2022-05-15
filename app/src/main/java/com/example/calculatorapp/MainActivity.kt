package com.example.calculatorapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var etnumber1: EditText
    lateinit var etnumber2: EditText
    lateinit var btnAddition: Button
    lateinit var  btnSubtraction:Button
    lateinit var btnMultiply: Button
    lateinit var btnModulus: Button
    lateinit var tvStatus: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etnumber1=findViewById(R.id.etnumber1)
        etnumber2=findViewById(R.id.etnumber2)
        btnAddition=findViewById(R.id.btnAddition)
        btnSubtraction=findViewById(R.id.btnSubtraction)
        btnMultiply=findViewById(R.id.btnMultiply)
        btnModulus=findViewById(R.id.btnModulus)
        tvStatus=findViewById(R.id.tvStatus)

        btnAddition.setOnClickListener {
            val num1=etnumber1.text.toString().toDouble()
            val num2=etnumber2.text.toString().toDouble()
            plus(num1,num2)
        }
        btnSubtraction.setOnClickListener {
            val num1=etnumber1.text.toString().toDouble()
            val num2=etnumber2.text.toString().toDouble()
            minus(num1,num2)
        }
        btnMultiply.setOnClickListener {
            val num1=etnumber1.text.toString().toDouble()
            val num2=etnumber2.text.toString().toDouble()
            multiply(num1,num2)
        }
        btnModulus.setOnClickListener {
            val num1=etnumber1.text.toString().toDouble()
            val num2=etnumber2.text.toString().toDouble()
            remain(num1,num2)
        }
    }
    fun plus(num1:Double, num2:Double){
        val total=num1+num2
        tvStatus.text= total.toString()

    }
    fun minus(num1:Double, num2:Double){
        val total=num1+num2
        tvStatus.text= total.toString()

    }
    fun multiply(num1:Double, num2:Double){
        val total=num1+num2
        tvStatus.text= total.toString()
    }
    fun remain(num1:Double, num2:Double){
        val total=num1+num2
        tvStatus.text= total.toString()
}

    }
