package com.bonato.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        // the state saved prior during the onpause method often..
        // it can be null
        super.onCreate(savedInstanceState) //call on Create in the base class
        setContentView(R.layout.activity_main)
    }
}