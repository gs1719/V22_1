package com.example.v22_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.v22_1.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity() {
    private lateinit var binding: ActivityUserBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        you need to add supportActionBar?.hide() it on all activity as you have to add installsplashscreen on each
        supportActionBar?.hide()
        binding = ActivityUserBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val name = intent.getStringExtra("name")
        val phoneNUmber = intent.getStringExtra("phone")
        val imageId = intent.getIntExtra("imageId", R.drawable.dog_breed_svgrepo_com__0_)
//                                                            getIntExtra is asking for default value

        binding.profileImage.setImageResource(imageId)
        binding.textView.text = name
        binding.textView2.text = phoneNUmber

    }
}