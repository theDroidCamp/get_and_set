package com.noelon.get_and_set

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        displayTextButton.setOnClickListener {
            val name = name_ET.text.toString()
            val teamName = TeamNameET.text.toString()
            val emailAddress = EmailET.text.toString()

            if (name.isNotEmpty() && teamName.isNotEmpty() && emailAddress.isNotEmpty()) {

                textView.text =
                    "My name is $name, and i'm in team $teamName. Here's my email address too $emailAddress "
            } else {

                Toast.makeText(this, "Fill in your details please", Toast.LENGTH_SHORT).show()
            }

        }


    }
}