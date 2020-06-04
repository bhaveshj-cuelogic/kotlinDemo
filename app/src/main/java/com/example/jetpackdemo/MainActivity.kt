package com.example.jetpackdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import java.util.*


class MainActivity : AppCompatActivity() {

    private lateinit var mModel: RandomNumberViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Get the view model
        mModel = ViewModelProviders.of(this).get(RandomNumberViewModel::class.java)

        // Create the observer which updates the ui
        val randomNumberObserver = Observer<Int>{newNumber->
            // Update the ui with current data
            textView.text = "Current Number : $newNumber"
        }

        // Observe the live data, passing in this activity as the life cycle owner and the observer
        mModel.currentRandomNumber.observe(this,randomNumberObserver)

        // Button click listener
        button.setOnClickListener{
            // Change the data
            mModel.currentRandomNumber.value = Random().nextInt(50)
        }
    }
}
