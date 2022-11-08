package com.example.multiui

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.multiui.MainActivity.Constant.extraName
import com.example.multiui.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        setContentView(binding.root)



        addCallbacks()
    }


   private fun addCallbacks(){
       binding.button.setOnClickListener{
           val intent = Intent(this,MainActivity2::class.java)
           val name = binding.textName.text.toString()
           intent.putExtra(extraName,name)
           startActivity(intent)
   }

       binding.btnPhone.setOnClickListener{
           val intent = Intent(Intent.ACTION_DIAL)
           val phoneNumer = binding.textPhone.text.toString()
           intent.data= Uri.parse("tel:$phoneNumer")
           startActivity(intent)
       }
    }
    object  Constant {
        val extraName = "extra name"
    }
}