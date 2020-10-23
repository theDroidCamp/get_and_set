package com.noelon.get_and_set

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_beryl.*

class BerylActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beryl)

        button.setOnClickListener{
            val myname = PersonName.text.toString()
            val myteamname= nameteam.text.toString()
            val myemail= EmailAddress.text.toString()

            if(myname.isNotEmpty() && myteamname.isNotEmpty( ) && myemail.isNotEmpty()){
                textView2.text =
                    "My name is $myname , and I'm in team $myteamname . Here is my email address too $myemail"
        }else{ Toast.makeText(this,"Fill in your details please" ,Toast.LENGTH_SHORT).show()}
    }
}


}
