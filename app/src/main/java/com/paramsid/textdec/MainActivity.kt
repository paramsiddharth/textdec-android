package com.paramsid.textdec

import android.os.Bundle
import android.webkit.WebView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)

		val primaryWebView: WebView = findViewById(R.id.webview_primary)
		primaryWebView.settings.javaScriptEnabled = true
		primaryWebView.loadUrl("https://textdec.paramsid.com")
	}
}