package com.example.kotlindemo

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;

class MainActivity : AppCompatActivity() {
    var REQUEST_CODE = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var username = userName.text
        var password = passwordtext.text

        submitbutton.setOnClickListener {
            //Toast.makeText(this,password  ,Toast.LENGTH_LONG).show()
            var intent = Intent(this,Navigation_drawer::class.java)
           // intent.putExtra("loginID", "ActiveUser123")
            startActivity(intent)
           // startActivityForResult(intent,REQUEST_CODE)
        }

        RegistrationClick.setOnClickListener {
            var intent = Intent(this,RegistrationActivity::class.java)
            intent.putExtra("loginID", "ActiveUser123")
           // startActivity(intent)
            startActivityForResult(intent,REQUEST_CODE)

        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode == REQUEST_CODE){
            if(resultCode == Activity.RESULT_OK){
                var result = data?.extras?.get("returnKey").toString()

                Toast.makeText(this,result  ,Toast.LENGTH_LONG).show()

            }

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

    override fun onPause() {
        super.onPause()
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onPostResume() {
        super.onPostResume()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

    override fun onStop() {
        super.onStop()
    }
}
