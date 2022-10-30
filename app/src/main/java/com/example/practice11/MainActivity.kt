package com.example.practice11

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun buttonOnClick(view: View){
        val photo:ImageView=findViewById(R.id.imageView5)
        val image:Int=R.drawable.arbuz1
        photo.setImageResource(image)
    }
    fun OnClickImage(view: View){
        val photo:ImageButton=findViewById(R.id.imageButton)
        val image:Int=R.drawable.btn_check_buttonless_on
        photo.setImageResource(image)
    }
}