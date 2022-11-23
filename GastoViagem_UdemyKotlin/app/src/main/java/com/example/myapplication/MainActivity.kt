package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener(this)
    }

    override fun onClick(p0: View) {
        if(p0.id == R.id.button){
            calculate()
        }
    }


    private fun calculate(){
        if(isValid()){
            val distance = binding.editDistancia.text.toString().toDouble()
            val price = binding.editPreco.text.toString().toDouble()
            val autonomy = binding.editAutonomia.text.toString().toDouble()

            val total = (distance * price) / autonomy
            binding.textGasto.text = "R$${"%.2f".format(total)}"
        }else{
            Toast.makeText(this, "Preencha corretamente", Toast.LENGTH_SHORT).show()
        }
    }

    private fun isValid(): Boolean{
        if(binding.editDistancia.text.toString().isEmpty()){
            return false
        }
        if(binding.editPreco.text.toString().isEmpty()){
            return false
        }
        if(binding.editAutonomia.text.toString().isEmpty() &&
            binding.editAutonomia.text.toString().toDouble() == 0.0){
            return false
        }

        return true;
    }


}