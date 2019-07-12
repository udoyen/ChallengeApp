package com.connect.systems.ng.challengeapp

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_profile.*

class AboutAndelaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_andela)
//        setSupportActionBar(toolbar)
        val andelaWebView = findViewById<WebView>(R.id.andelaWebView)
        val webviewtxt = findViewById<TextView>(R.id.webViewTxt)
        // Get the url
        val extras = intent.extras  ?: return
        val urlString = extras.getString("andelaURL")
        // set the webclient
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            andelaWebView.webViewClient = WebViewClient()
        }
        // Property access syntax
        webviewtxt.text = urlString
        // Load the URL
        andelaWebView.loadUrl(urlString)
    }
}
