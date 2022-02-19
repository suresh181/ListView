package com.example.listview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.listview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val list = arrayOf(
            "MS Dhoni",
            "C Hari Nishaanth",
            "Devon Conway",
            "Robin Uthappa",
            "Ruturaj Gaikwad",
            "Subhranshu Senapati",
            "Ambati Rayudu",
            "Narayan Jagadeesan",
            "Chris Jordan",
            "Dwaine Pretorius",
            "Dwayne Bravo",
            "K Bhagath Varma",
            "Mitchell Santner",
            "Moeen Ali",
            "Rajvardhan Hangargekar",
            "Ravindra Jadeja",
            "Shivam Dube",
            "Adam Milne",
            "Deepak Chahar",
            "KM Asif"
        )

        val arrayAdapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, list)
        binding.lvList.adapter = arrayAdapter


        binding.lvList.setOnItemClickListener { adapterView, view, i, l ->
            intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("value","${list[i]}")
            startActivity(intent)
        }
    }

}
