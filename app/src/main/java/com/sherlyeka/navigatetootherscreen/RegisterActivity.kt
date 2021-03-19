package com.sherlyeka.navigatetootherscreen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class RegisterActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var  btnIntent: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register);

        btnIntent = findViewById(R.id.btnLogin)
        btnIntent.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when(v.id){
            R.id.btnLogin ->{
                val Login = Intent(this@RegisterActivity, LoginActivity::class.java)
                startActivity(Login)
            }
        }
    }

}