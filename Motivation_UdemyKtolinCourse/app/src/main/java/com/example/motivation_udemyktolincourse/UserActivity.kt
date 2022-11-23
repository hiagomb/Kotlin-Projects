package com.example.motivation_udemyktolincourse

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.motivation_udemyktolincourse.databinding.ActivityUserBinding

class UserActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityUserBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityUserBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar?.hide()

        binding.button2.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
        if(p0.id == R.id.button2){
            save()
        }
    }


    private fun save(){
        if(!binding.editName.text.toString().isEmpty()){
            val sharedPreferences = MySharedPreferences(this)
            sharedPreferences.saveField("user", binding.editName.text.toString())

            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }else{
            Toast.makeText(this, "Preenche seu nome", Toast.LENGTH_SHORT).show()
        }
    }
}