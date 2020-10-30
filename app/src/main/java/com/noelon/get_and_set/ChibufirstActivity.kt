package com.noelon.get_and_set

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_chibufirst.*

class ChibufirstActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chibufirst)

        button_display.setOnClickListener {
            val name = edit_name.text.toString()
            val teamName = edit_team.text.toString()
            val email = edit_email.text.toString()
            if (TextUtils.isEmpty(name) && TextUtils.isEmpty(teamName) && TextUtils.isEmpty(email)) {
                Toast.makeText(this, "Please, fill in your details.", Toast.LENGTH_SHORT).show()
            } else {
                text_details.text =
                    "My name is $name, team $teamName and my email address is $email."
            }
        }
    }
}