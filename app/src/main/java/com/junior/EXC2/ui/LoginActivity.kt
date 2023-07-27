package com.junior.EXC2.ui

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import android.util.Patterns
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.junior.EXC2.databinding.ActivityLoginBinding




// login cod
class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.tilEmail.editText?.addTextChangedListener {text ->
            binding.btnLogin.isEnabled = validateEmailPassword(text.toString(), binding.tilPassword.editText?.text.toString())
        }

        binding.tilPassword.editText?.addTextChangedListener {text ->
            binding.btnLogin.isEnabled = validateEmailPassword(binding.tilEmail.editText?.text.toString(),text.toString())
        }

        //
        binding.btnLogin.setOnClickListener{
            val intent = Intent(this, MainActivity ::class.java)
            startActivity(intent)
            finish()
        }




    }

    @SuppressLint("SuspiciousIndentation")
    private fun validateEmailPassword(email: String, password: String):Boolean{
        val isEmailValid=email.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(email).matches() && email =="ejemplo@idat.edu.pe"
        val isPasswordValid = password.isNotEmpty() && password =="123456"
           if(!isEmailValid || !isPasswordValid){
               sendMessage("Datos Erroneos")
           }
        return isEmailValid && isPasswordValid




    }

    private fun sendMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }
}