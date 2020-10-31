package com.noelon.get_and_set

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class NadiaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_nadia)

        val name: EditText = findViewById(R.id.editText_Name)
        val teamLollipop: EditText = findViewById(R.id.editText_team)
        val email: EditText = findViewById(R.id.editTextText_email)
        val text: TextView = findViewById(R.id.textView_text)
        val showButton: Button = findViewById(R.id.button_nadia)

        showButton.setOnClickListener {
            val name = name.text.toString()
            val teamName = teamLollipop.text.toString()
            val email = email.text.toString()
            if (name.isNotEmpty() && teamName.isNotEmpty() && email.isNotEmpty()) {
                textView.text =
                    "My name is $name, and i am in $teamLollipop. Here is my email address too $email"
            } else {
                Toast.makeText(this, "Fill in your Details", Toast.LENGTH_SHORT).show()
            }
        }
    }
}