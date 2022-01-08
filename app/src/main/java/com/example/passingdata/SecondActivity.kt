package com.example.passingdata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.passingdata.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("EXTRA_NAME")
        val age = intent.getIntExtra("EXTRA_AGE", 0)
        val country = intent.getStringExtra("EXTRA_COUNTRY")

        val personString = "$name is $age years old From $country"

        val person = intent.getSerializableExtra("EXTRA_PERSON")
//        val tvPerson = findViewById<TextView>(R.id.tvPerson)
//        tvPerson.text = personString

        binding.tvPerson.text = personString

    }
}