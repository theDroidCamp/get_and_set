package com.noelon.get_and_set

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class OscarActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_oscar)
       val screen:TextView = findViewById(R.id.textView_screen)
        val firstName:EditText = findViewById(R.id.editText_first_name)
        val teamName: EditText = findViewById(R.id.editText_last_name)
        val level:EditText = findViewById(R.id.editText_level)
        val email:EditText = findViewById(R.id.editText_email)
        val submit:Button = findViewById(R.id.button_oscar)

        submit.setOnClickListener(View.OnClickListener {
            var fName:String = firstName.text.toString()
            var tName:String = teamName.text.toString()
            var lv:String = level.text.toString()
            var eM = email.text.toString().trim()

            if(firstName.text.isEmpty() && teamName.text.isEmpty()&& level.text.isEmpty() && email.text.isEmpty()){
                Toast.makeText(this, "Fill in your Details please", Toast.LENGTH_SHORT).show()
            }
            else{
               screen.text ="My name is $fName i am in Team $tName. $lv Level, you can reach with $eM  "
                firstName.text.clear()
                teamName.text.clear()
                level.text.clear()
                email.text.clear()
            }

        })

    }
}