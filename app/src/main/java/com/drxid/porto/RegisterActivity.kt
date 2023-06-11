package com.drxid.porto

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class RegisterActivity : AppCompatActivity() {

    private lateinit var etEmail: EditText
    private lateinit var etPassword: EditText
    private lateinit var btnRegister: Button
    private lateinit var btnRegisterToLogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        // Inisialisasi view
        etEmail = findViewById(R.id.et_email)
        etPassword = findViewById(R.id.et_pwd)
        btnRegister = findViewById(R.id.btn_register)
        btnRegisterToLogin = findViewById(R.id.btn_registertologin)

        btnRegister.setOnClickListener {
            registerUser()
        }

        btnRegisterToLogin.setOnClickListener {
            navigateToLogin()
        }
    }

    private fun registerUser() {
        val email = etEmail.text.toString()
        val password = etPassword.text.toString()

        val user = User(email, password)
        UserDatabase.addUser(user)

        navigateToLoginActivity()
    }

    private fun navigateToLogin() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }

    private fun navigateToLoginActivity() {
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
        finish()
    }
}
