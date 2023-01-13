package com.example.wedding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var bottomNav: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadFragment(Home())
        bottomNav = findViewById(R.id.bottomNavigationView)
        bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home_icon -> {
                    loadFragment(Home())
                }
                R.id.letter_icon -> {
                    loadFragment(AboutUs())
                }
                R.id.image_icon -> {
                    loadFragment(Images())
                }
                R.id.graph_icon -> {
                    loadFragment(List())
                }
                R.id.user_icon -> {
                    loadFragment(Profile())
                }
                else -> {}
            }
            true
        }
    }

    private fun loadFragment(fragment: Fragment) {
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.frame_layout, fragment)
        transaction.commit()
    }
}