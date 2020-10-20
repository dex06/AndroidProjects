package com.mbds.tp1.ui.login

import android.app.Activity
import android.content.Intent
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher
import android.view.LayoutInflater
import android.view.View
import android.view.inputmethod.EditorInfo
import android.widget.Button
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.Toast
import com.mbds.tp1.MainActivity

import com.mbds.tp1.R
import com.mbds.tp1.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {

    lateinit var bindings: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindings = ActivityLoginBinding.inflate(LayoutInflater.from(baseContext))
        setContentView(bindings.root)
        initViews()
}
    private  fun initViews(){
        bindings.login.setOnClickListener(){
            handleClick()
        }
    }

    private fun handleClick(){
        if(!bindings.username.text.isNullOrBlank() && !bindings.password.text.isNullOrBlank()){
            val intent = Intent(baseContext, MainActivity::class.java)
            startActivity(intent)
        }else{
            Toast.makeText(baseContext, "Please fill all the fields!", Toast.LENGTH_LONG).show()
        }
    }
}