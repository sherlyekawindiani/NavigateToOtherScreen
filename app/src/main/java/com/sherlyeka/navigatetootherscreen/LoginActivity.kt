package com.sherlyeka.navigatetootherscreen

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class LoginActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var  btnIntent: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login);

       btnIntent = findViewById(R.id.btnRegister)
        btnIntent.setOnClickListener(this)
    }

    override fun onClick(v: View) {
       when(v.id){
           R.id.btnRegister ->{
               val Register = Intent(this@LoginActivity, RegisterActivity::class.java)
               startActivity(Register)
           }
       }
    }
}
