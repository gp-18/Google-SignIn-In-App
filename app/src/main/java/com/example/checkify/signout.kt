package com.example.checkify

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast
import androidx.annotation.NonNull
import com.google.android.gms.auth.api.signin.GoogleSignInClient

import com.google.android.gms.tasks.OnCompleteListener




class signout : AppCompatActivity() {
    private lateinit var  mGoogleSignInClient: GoogleSignInClient
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signout)
        val rBar = findViewById<RatingBar>(R.id.ratingBar)
        if (rBar != null) {
            val button = findViewById<Button>(R.id.button3)
            button?.setOnClickListener {
                val msg = rBar.rating.toString()
                Toast.makeText(this , "Rating is: " + msg , Toast.LENGTH_SHORT).show()
            }
        }
        val bb=findViewById<Button>(R.id.button)
        bb.setOnClickListener {
            signOut();
        }
    }
    private fun signOut() {
        mGoogleSignInClient.signOut()
            .addOnCompleteListener(this , OnCompleteListener<Void?> {
                Toast.makeText(this,"Signing Out",Toast.LENGTH_SHORT).show()
                startActivity(Intent(this,login::class.java))
            })
    }

}