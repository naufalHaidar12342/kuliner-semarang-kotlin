package com.example.kulinersemarang

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.kulinersemarang.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var bindingMainActivity:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMainActivity= ActivityMainBinding.inflate(layoutInflater)
        setContentView(bindingMainActivity.root)

        setSupportActionBar(bindingMainActivity.materialToolbar)



    }
}