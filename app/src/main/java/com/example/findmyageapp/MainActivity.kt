package com.example.findmyageapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnGetAge.setOnClickListener {
            // Add code to run when button click
            buttonGetAgeClick()
        }

    }

    private fun buttonGetAgeClick() {
        val userDOB = Integer.parseInt(editTextDOB.text.toString())
        val currentYear = Calendar.getInstance().get(Calendar.YEAR)
        if (userDOB > currentYear) {
            Toast.makeText(this, "Please enter your valid DOB", Toast.LENGTH_SHORT)
                .show()
            return
        }
        val userAgeInYears = currentYear - userDOB
        tvAge.text = "Your age is $userAgeInYears Years"
    }
}
