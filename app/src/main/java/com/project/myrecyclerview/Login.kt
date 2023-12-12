package com.project.myrecyclerview
//import
import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.project.myrecyclerview.databinding.ActivityLoginBinding

class Login : AppCompatActivity() {

    private lateinit var binding: ActivityLoginBinding

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.loginButton.setOnClickListener(View.OnClickListener {
            if (binding.username.text.toString() == "nimatulfajri10.03@gmail.com" && binding.password.text.toString() == "12345"){
                Toast.makeText(this, "Login Success!", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this@Login, MainActivity::class.java))
            } else {
                Toast.makeText(this, "Login Failed!", Toast.LENGTH_SHORT).show()
            }
        })
    }
}