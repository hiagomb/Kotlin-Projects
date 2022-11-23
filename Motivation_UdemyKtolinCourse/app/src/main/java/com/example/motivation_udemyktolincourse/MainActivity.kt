package com.example.motivation_udemyktolincourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.motivation_udemyktolincourse.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()
        binding.button.setOnClickListener(this)

        val sharedPreferences = MySharedPreferences(this)
        binding.textSaudacao.text = sharedPreferences.getField("user")
    }

    override fun onClick(p0: View) {
        if(p0.id == R.id.button){
            generateNewFrase()
        }
    }

    private fun generateNewFrase(){

    }


}