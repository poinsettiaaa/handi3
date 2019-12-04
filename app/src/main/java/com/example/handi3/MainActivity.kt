package com.example.handi3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var dogList = arrayListOf(
            Dog("Chow Chow", "Male", "4", "dog00"),
            Dog("Breed Pomeranian", "Female", "1", "dog01"),
            Dog("Golden Retriver", "Female", "3", "dog02"),
            Dog("Yorkshire Terrier", "Male", "5", "dog03"),
            Dog("Pug", "Male", "4", "dog04"),
            Dog("Alaskan Malamute", "Male", "7", "dog05"),
            Dog("Shih Tzu", "Female", "5", "dog06")
        )

            val mAdapter = MainRvAdapter(this, dogList)
            mRecyclerView.adapter = mAdapter

            val lm = LinearLayoutManager(this)
            mRecyclerView.layoutManager = lm
            mRecyclerView.setHasFixedSize(true)


    }
}
