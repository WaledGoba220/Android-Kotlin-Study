package com.example.mysecondapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.switchmaterial.SwitchMaterial

class MainActivity : AppCompatActivity() {
    lateinit var textTitle: TextView
    lateinit var clickBtn: Button
    var count = 0

    lateinit var  btnClick :Button
    lateinit var switchMat:SwitchMaterial
    lateinit var textUsername:EditText


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        increment()


//
//        initView()
//        additionCallbacks()


    }






  private  fun increment(){

        textTitle = findViewById(R.id.textView)
        textTitle.text = "This is First App"


        clickBtn = findViewById(R.id.button)
        clickBtn.text = "Done Clickable"

        clickBtn.setOnClickListener(){
            textTitle.text = "Counter = $count"
            count++
        }

    }




//    private fun additionCallbacks(){
//        switchMat.setOnCheckedChangeListener { compoundButton, b ->
//            btnClick.isEnabled = b
//        }
//    }
//
//    private  fun initView(){
//        btnClick = findViewById(R.id.button)
//        switchMat = findViewById(R.id.switch_username)
//        textUsername = findViewById(R.id.text_username)
//
//    }
//
//    companion object{
//        const val LOG_TAG = "MyACTIVITY"
//    }
}