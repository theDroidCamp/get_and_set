package com.noelon.get_and_set

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_khay.*
import kotlinx.android.synthetic.main.activity_main.*

class Khay : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_khay)

        displayDetailsButton.setOnClickListener {
            val name = your_name.text.toString()
            val country = YourCountry.text.toString()
            val emailAddress = YourEmail.text.toString()

            if (name.isNotEmpty() && country.isNotEmpty() && emailAddress.isNotEmpty()) {

                textView.text =
                    "My name is $name, and I'm from $country. Here's my email address too $emailAddress "
            } else {

                Toast.makeText(this, "Fill in your details please", Toast.LENGTH_SHORT).show()
            }
        }
    }
}