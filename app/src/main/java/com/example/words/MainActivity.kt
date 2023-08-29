package com.example.words

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.words.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val words = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view: View = binding.root
        setContentView(view)

        binding.saveWord.setOnClickListener {
            val word = binding.inputEditName.text.trim().toString()
            words.add(word)
        }

        binding.clearWords.setOnClickListener {
            words.clear()
            binding.textViewMessage.text = ""
        }

        binding.showWords.setOnClickListener {
            binding.textViewMessage.text = words.toString()
        }
    }
}