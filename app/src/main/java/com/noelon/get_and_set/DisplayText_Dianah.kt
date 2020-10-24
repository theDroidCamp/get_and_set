package com.noelon.get_and_set

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_display_text__dianah.*

class DisplayText_Dianah : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_text__dianah)

        displayText.setOnClickListener {
            val nameText = your_name.text.toString()
            val teamText = your_team.text.toString()
            val emailText = your_email.text.toString()

            if (nameText.isNotEmpty() && teamText.isNotEmpty() && emailText.isNotEmpty()) {

                displayed_text.text =
                    "Hola! I am $nameText, and my dream team is $teamText. Shoot me an email at $emailText "
            } else {

                Toast.makeText(this, "Kindly fill in some details about ya ;) ", Toast.LENGTH_SHORT).show()
            }


        }


    }
}
