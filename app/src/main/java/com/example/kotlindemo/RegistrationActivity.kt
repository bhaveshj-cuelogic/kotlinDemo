package com.example.kotlindemo

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast


class RegistrationActivity : AppCompatActivity()  {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        var data = intent.extras
        if(data != null) {
            var userid = data.get("loginID")
            Toast.makeText(this, "$userid", Toast.LENGTH_LONG).show()
        }

    }


    override fun onStop() {
        super.onStop()
       // Toast.makeText(this, "Stop", Toast.LENGTH_LONG).show()
//        var returnIntent = this.intent
//        returnIntent.putExtra("returnKey" ,"backtologin")
//        setResult(Activity.RESULT_OK ,returnIntent)
//        finish()
    }

    fun onclickBack(view: View) {
        var returnIntent = this.intent
        returnIntent.putExtra("returnKey" ,"backtologin")
        setResult(Activity.RESULT_OK ,returnIntent)
        finish()
    }
}
