package com.example.islamiapp.fragmentExample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.islamiapp.R

class MainActivity : AppCompatActivity() {

    lateinit var profileText: TextView
    lateinit var settingsText: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        profileText = findViewById(R.id.profile_screen_label)
        settingsText = findViewById(R.id.setting_screen_label)

        profileText.setOnClickListener(View.OnClickListener { view ->

            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container, ProfileFragment())
                .addToBackStack(null)
                .commit()//there is a fn called add() that takes same parameters as replace()
        })

        settingsText.setOnClickListener(View.OnClickListener { view ->

            supportFragmentManager
                .beginTransaction()
                .replace(R.id.fragment_container, SettingsFragment())
                .addToBackStack(null)
                .commit()
        })
    }

}