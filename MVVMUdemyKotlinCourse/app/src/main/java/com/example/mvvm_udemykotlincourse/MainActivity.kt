package com.example.mvvm_udemykotlincourse

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.mvvm_udemykotlincourse.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        setObserver()

        binding.buttonLogin.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
        if(p0.id == R.id.button_login){
            val email = binding.editTextEmail.text.toString()
            val password = binding.editTextPassword.text.toString()

            viewModel.doLogin(email, password)
        }
    }


    private fun setObserver(){
        viewModel.welcome().observe(this, Observer {
            binding.textTeste.text = it
        })

        viewModel.login().observe(this, Observer {
            if(it){
                Toast.makeText(this, "Logado com sucesso", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "Falha no login", Toast.LENGTH_SHORT).show()
            }
        })
    }


}