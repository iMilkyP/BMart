package com.example.test_project2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.bmartdashboard.R

class SignUp : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val textView: TextView = findViewById<TextView>(R.id.log_in)
        textView.setOnClickListener(View.OnClickListener {

            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        })
    }
}