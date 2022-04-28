package com.yusufemirhanarslan.kotlinintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_next.*

class NextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_next)

        //getIntent

        val intent = intent
        val userName = intent.getStringExtra("username")
        val name = intent.getStringExtra("name")

        userNameTextNextActivity.text = "Username: "+ userName
        nameTextNextActivity.text = "Name: "+ name

    }
}