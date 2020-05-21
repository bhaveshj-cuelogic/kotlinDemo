package com.example.kotlindemo

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.navigation.NavigationView
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.appcompat.widget.Toolbar
import androidx.appcompat.app.ActionBarDrawerToggle
import android.view.MenuItem


class RegistrationActivity : AppCompatActivity(),NavigationView.OnNavigationItemSelectedListener  {

    lateinit var toolbar: Toolbar
    lateinit var drawerLayout: DrawerLayout
    lateinit var navView: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)
        var data = intent.extras
        if(data != null) {
            var userid = data.get("loginID")
            Toast.makeText(this, "$userid", Toast.LENGTH_LONG).show()
        }

        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)

        drawerLayout = findViewById(R.id.drawer_layout)
        navView = findViewById(R.id.nav_view)

        val toggle = ActionBarDrawerToggle(
            this, drawerLayout, toolbar, 0, 0
        )
        drawerLayout.addDrawerListener(toggle)
        toggle.syncState()
        navView.setNavigationItemSelectedListener(this)

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.nav_profile -> {
                Toast.makeText(this, "Profile clicked", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_messages -> {
                Toast.makeText(this, "Messages clicked", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_friends -> {
                Toast.makeText(this, "Friends clicked", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_update -> {
                Toast.makeText(this, "Update clicked", Toast.LENGTH_SHORT).show()
            }
            R.id.nav_logout -> {
                Toast.makeText(this, "Sign out clicked", Toast.LENGTH_SHORT).show()
            }
        }
        drawerLayout.closeDrawer(GravityCompat.START)
        return true
    }



    override fun onStop() {
        super.onStop()
       // Toast.makeText(this, "Stop", Toast.LENGTH_LONG).show()
//        var returnIntent = this.intent
//        returnIntent.putExtra("returnKey" ,"backtologin")
//        setResult(Activity.RESULT_OK ,returnIntent)
//        finish()
    }

//    fun onclickBack(view: View) {
//        var returnIntent = this.intent
//        returnIntent.putExtra("returnKey" ,"backtologin")
//        setResult(Activity.RESULT_OK ,returnIntent)
//        finish()
//    }
}
