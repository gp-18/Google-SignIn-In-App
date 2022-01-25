package com.example.checkify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        auth= FirebaseAuth.getInstance()
        var text=findViewById<TextView>(R.id.email)
        text.setText(auth.currentUser?.email)
        var name=findViewById<TextView>(R.id.name)
        name.setText(auth.currentUser?.displayName)
        val signout =findViewById<Button>(R.id.signout)
        signout.setOnClickListener {
            startActivity(Intent(this,signout::class.java))
        }
        val notesapp=findViewById<Button>(R.id.notesapp);
        notesapp.setOnClickListener {
            startActivity(Intent(this,mainapp::class.java))
        }
    }
}