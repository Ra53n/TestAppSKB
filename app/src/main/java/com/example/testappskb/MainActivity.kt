package com.example.testappskb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.testappskb.ui.main.LoginFragment
import com.example.testappskb.ui.main.SearchFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, LoginFragment

                    .newInstance())
                .commitNow()
        }
    }
}