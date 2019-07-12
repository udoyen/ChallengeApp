package com.connect.systems.ng.challengeapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val andelaBtn = findViewById<Button>(R.id.activityABtn)
        val myUrlBtn = findViewById<Button>(R.id.myProfileBtn)

        //set the onclick event listener
        andelaBtn.setOnClickListener {
            val andelaIntent = Intent(this, AboutAndelaActivity::class.java)
            andelaIntent.putExtra("andelaURL", "https://andela.com/alc/")
            startActivity(andelaIntent)
        }

        myUrlBtn.setOnClickListener {
            val myProfileIntent = Intent(this, ProfileActivity::class.java)
            startActivity(myProfileIntent)
        }
    }


}
