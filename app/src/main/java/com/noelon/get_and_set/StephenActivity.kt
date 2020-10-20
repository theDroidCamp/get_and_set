package com.noelon.get_and_set

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_stephen.*


class StephenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_stephen)

        displayTextButton.setOnClickListener {
            val name = name.text.toString()
            val teamName = team_name.text.toString()
            val emailAddress = email.text.toString()

            if (name.isNotEmpty() && teamName.isNotEmpty() && emailAddress.isNotEmpty()) {
                textView.text = "My name is $name \n I'm in team $teamName \n Here's my email address too $emailAddress "
            } else {
                Toast.makeText(this, "Fill in your details please", Toast.LENGTH_SHORT).show()
            }


        }


    }
}