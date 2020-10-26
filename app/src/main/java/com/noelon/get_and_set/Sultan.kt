package com.noelon.get_and_set

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_sultan.*

class Sultan : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sultan)


        button_display.setOnClickListener {

            val inputname = name.text.toString()
            val teamName = team_name.text.toString()
            val emailAddress = email.text.toString()
            val phoneNumber = phone_number.text.toString()

            if
                (inputname.isNotEmpty() && teamName.isNotEmpty() && emailAddress.isNotEmpty()
                        && phoneNumber.isNotEmpty()) {

                show_text.text =
                    "My name is $inputname, am in team $teamName, this is my email address $emailAddress" +
                            "and my contact number $phoneNumber"
            } else {

                Toast.makeText(this, "Correctly fill in all your details!", Toast.LENGTH_LONG).show()
            }
            }
        }
    }


