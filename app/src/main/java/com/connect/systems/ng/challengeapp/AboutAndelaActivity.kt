package com.connect.systems.ng.challengeapp

import android.net.http.SslError
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.SslErrorHandler
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_profile.*

class AboutAndelaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about_andela)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        val andelaWebView = findViewById<WebView>(R.id.andelaWebView)

        // Get the url
        val extras = intent.extras ?: return
        val urlString = extras.getString("andelaURL")

        // set the webclient
        andelaWebView.webViewClient = object : WebViewClient() {
            override fun onReceivedSslError(view: WebView?, handler: SslErrorHandler?, error: SslError?) {
                handler?.proceed()
            }
        }


        // Load the URL
        andelaWebView.loadUrl(urlString)
    }
}
