package com.example.v22_1

import android.content.Intent
import android.os.Binder
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.v22_1.databinding.ActivityMainBinding
import com.example.v22_1.databinding.EachItemLayoutBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var binding1: EachItemLayoutBinding

    private lateinit var userArrayList: ArrayList<User>

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)
        supportActionBar?.hide()

        val name = arrayOf(
            "Dog 1",
            "Dog 2",
            "Dog 3",
            "Dog 4",
            "Dog 5"
        )

        val lastmessage = arrayOf(
            "BOW BOW BOW! \uD83D\uDC36",
            "BOW BOW BOW! 🐶",
            "wHOOOOOOOOOO",
            "BOW BOW BOW! 🐶",
            "WHOOOOooooooooo"
        )

        val lastmessageTime = arrayOf(
            "1.45 AM",
            "2.35 AM",
            "3.25 PM",
            "4.10 PM",
            "5.11 PM"
        )

        val phoneNumber =
            arrayOf(
                "9876543211",
                "9876543212",
                "9876543213",
                "9876543214",
                "9876543215"
            )

        val imgId = intArrayOf(
            R.drawable.dog_breed_svgrepo_com__0_,
            R.drawable.dog_breed_svgrepo_com__1_,
            R.drawable.dog_breed_svgrepo_com__2_,
            R.drawable.dog_breed_svgrepo_com__3_,
            R.drawable.dog_breed_svgrepo_com__4_,
        )

        userArrayList = ArrayList()

        for (eachIndex in name.indices) {
            //            Creating user object and Adding it to ArrayList
            val user = User(
                name[eachIndex],
                lastmessage[eachIndex],
                lastmessageTime[eachIndex],
                phoneNumber[eachIndex],
                imgId[eachIndex]
            )

            userArrayList.add(user)

        }
        // creating own adapter and setting it to the listView

        binding.listView.adapter = MyAdapter(this,userArrayList)

        binding.listView.setOnItemClickListener { parent, view, position, id ->

            val userName = name[position]
            val userPhone = phoneNumber[position]
            val imgId = imgId[position]

            val i = Intent(this,UserActivity::class.java)

            i.putExtra("name",userName)

            i.putExtra("phone",userPhone)
            i.putExtra("imageId",imgId)

            startActivity(i)

        }
    }


}