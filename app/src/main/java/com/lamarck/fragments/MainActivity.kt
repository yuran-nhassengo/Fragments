package com.lamarck.fragments

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.add
import androidx.fragment.app.commit

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if(savedInstanceState ==null){
            supportFragmentManager.commit {
                setReorderingAllowed(true)
                add<exemplo_fragment>(R.id.fragment_container_view)
            }
        }
    }
}