package com.example.algorytmika


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.text.isDigitsOnly
import kotlinx.android.synthetic.main.activity_main.*
import android.R.bool
import java.lang.Math.sqrt

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        check_btn.setOnClickListener {


            if (number_et.text.isNotEmpty()) {


                if (number_et.text.isDigitsOnly()) {
                    val num = number_et.text.toString().toInt()


                    if (CheckPrime(num)) {
                        Toast.makeText(this, "Entered number is a Prime Number.", Toast.LENGTH_SHORT).show()
                    } else {
                        Toast.makeText(this, "Entered number is a not a Prime Number.", Toast.LENGTH_SHORT).show()
                    }
                }

                else {
                    Toast.makeText(this, "please enter a valid number.", Toast.LENGTH_SHORT).show()
                }
            }

            else {
                Toast.makeText(this, "please enter a number", Toast.LENGTH_SHORT).show()
            }
        }
    }


    private fun CheckPrime(num: Int): Boolean {

        if (num <= 1) return false

        for (i in 2..kotlin.math.sqrt(num.toDouble()).toInt()) if (num % i == 0) return false
        return true
    }

}
}