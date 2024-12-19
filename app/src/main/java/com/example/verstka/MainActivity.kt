package com.example.verstka

import android.content.Intent
import android.os.Bundle
import android.text.InputType
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgShowHidePassword = findViewById<ImageView>(R.id.imgShowHidePassword)
        val editTextPass = findViewById<EditText>(R.id.editTextPassword)
        val tvSignIn = findViewById<TextView>(R.id.textViewGoToSignIn)

        imgShowHidePassword.setOnClickListener {
            if (editTextPass.inputType == InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD) {
                editTextPass.inputType = InputType.TYPE_TEXT_VARIATION_VISIBLE_PASSWORD
                imgShowHidePassword.setImageDrawable(getDrawable(R.drawable.eye_open))
            } else {
                editTextPass.inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_VARIATION_PASSWORD
                imgShowHidePassword.setImageDrawable(getDrawable(R.drawable.eye_slash))
            }
            editTextPass.setSelection(editTextPass.text.length)
            // Move the cursor to the end of the text
//            Toast.makeText(this, "Hello world!", Toast.LENGTH_LONG).show()
        }
        tvSignIn.setOnClickListener {
            startActivity(Intent(this, AutrizationActivity::class.java))
        }
    }
}