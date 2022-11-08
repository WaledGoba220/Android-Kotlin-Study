package com.example.spinners

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.spinners.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setContentView(R.layout.activity_main)
        initSpinner()

    }


    private  fun initSpinner(){
        val item = listOf("A","B","C","D")
        val myAdapter = ArrayAdapter(this,R.layout.spinner,item)

        binding.spinner.apply {
            adapter = myAdapter
            onItemClickListener = object :AdapterView.OnItemClickListener{
                override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                    Toast.makeText(this@MainActivity,item[p2], Toast.LENGTH_SHORT).show()
                }

                fun onNothingSelected(p0: AdapterView<*>?){

                }

            }
        }
    }
}