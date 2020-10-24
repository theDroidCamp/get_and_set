package com.noelon.get_and_set

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_emu.*
import kotlinx.android.synthetic.main.activity_emu.name
import kotlinx.android.synthetic.main.activity_stephen.*

private class EmuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_emu)

        display_button.setOnClickListener {    val name = name.text.toString()
            val teamName = team_name.text.toString()
            val mailAddress = team_mail.text.toString()

            if (name.isNotEmpty() && teamName.isNotEmpty() && mailAddress.isNotEmpty()) {

                textView.text =
                    "Hey there, I'm $name, and I'm in Droidcamp's $teamName. Here's my email $mailAddress "
            } else {

                Toast.makeText(this, " Update your details please", Toast.LENGTH_SHORT).show()
            }
        }
    }



}