package com.example.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var username = userName.text
        var password = passwordtext.text


        submitbutton.setOnClickListener {
            Toast.makeText(this,password  ,Toast.LENGTH_LONG).show()
        }
    }

    fun onclickShowPW(view: View) {
        view as CheckBox
        var isClicked : Boolean = view.isChecked
        if (isClicked){
            passwordtext.transformationMethod = HideReturnsTransformationMethod.getInstance()
        }
        else{
            passwordtext.transformationMethod = PasswordTransformationMethod.getInstance()
        }

    }
}
