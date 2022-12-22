package com.melbetips.app

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.webkit.WebView
import android.webkit.WebViewClient
import com.google.android.material.snackbar.Snackbar
import com.melbetips.app.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var rijf : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        rijf = ActivityMainBinding.inflate(layoutInflater)
        setContentView(rijf.root)
        fijgjidgf()
        sdfoksdfoksd()
    }


    private fun sdfoksdfoksd() = with(rijf){
        mellWeb.loadUrl(resources.getString(R.string.mell_web))
        Snackbar.make(rijf.root,"Loading...",Snackbar.LENGTH_SHORT).show()
        mellWeb.webViewClient = object : WebViewClient(){
            @Deprecated("Deprecated in Java")
            override fun shouldOverrideUrlLoading(jzxcijiczx: WebView?, eork: String?): Boolean {
                eork?.let { jzxcijiczx?.loadUrl(it) }

                return true

            }

        }
    }


    @SuppressLint("SetJavaScriptEnabled")
    private fun fijgjidgf() = with(rijf){
        val dfuisfij = mellWeb.settings
        dfuisfij.allowFileAccess = true

        dfuisfij.allowUniversalAccessFromFileURLs = true
        dfuisfij.domStorageEnabled = true
        dfuisfij.setSupportZoom(true)


        dfuisfij.setSupportMultipleWindows(true)
        dfuisfij.javaScriptCanOpenWindowsAutomatically = true
        dfuisfij.useWideViewPort = true


        dfuisfij.loadWithOverviewMode = true
        dfuisfij.setAppCacheEnabled(true)
        dfuisfij.javaScriptEnabled = true
        dfuisfij.allowContentAccess = true
        dfuisfij.saveFormData = true
        dfuisfij.javaScriptCanOpenWindowsAutomatically = true
        dfuisfij.loadWithOverviewMode = true
        dfuisfij.allowFileAccess = true


    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        super.onSaveInstanceState(outState, outPersistentState)
        rijf.mellWeb.saveState(outState)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        rijf.mellWeb.restoreState(savedInstanceState)
    }
}