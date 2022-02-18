package com.metehanbolat.databindingdetails

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.lifecycle.ViewModelProvider
import com.metehanbolat.databindingdetails.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private lateinit var myViewModel: MyViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        myViewModel = ViewModelProvider(this)[MyViewModel::class.java]

        binding.viewModel = myViewModel
        binding.lifecycleOwner = this

        binding.editText.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
            override fun onTextChanged(char: CharSequence?, p1: Int, p2: Int, p3: Int) {
                myViewModel.setMessage(char.toString())
            }
            override fun afterTextChanged(p0: Editable?) {}

        })

    }
}