package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        buttonIniciar.setOnClickListener {
            if (input.text.toString().isEmpty()){
                Toast.makeText(this,"Digite seu nome", Toast.LENGTH_SHORT).show()
            }
            else{
                var intent = Intent(this, QuestionActiviy::class.java)
                intent.putExtra(
                    "${setData.name}", input.text.toString()
                )
                startActivity(intent)
                finish()
            }
        }
    }
}