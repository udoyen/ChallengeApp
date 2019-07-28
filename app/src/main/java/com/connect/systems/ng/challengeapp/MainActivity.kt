package com.connect.systems.ng.challengeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //set the onclick event listener
        activityABtn.setOnClickListener {
            val andelaIntent = Intent(this, AboutAndelaActivity::class.java)
            andelaIntent.putExtra("andelaURL", "https://andela.com/alc/")
            startActivity(andelaIntent)
        }

        myProfileBtn.setOnClickListener {
            val myProfileIntent = Intent(this, ProfileActivity::class.java)
            startActivity(myProfileIntent)
        }
    }


}
