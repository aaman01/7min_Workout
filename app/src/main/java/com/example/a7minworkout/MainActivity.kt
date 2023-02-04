package com.example.a7minworkout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.FrameLayout
import android.widget.Toast
import com.example.a7minworkout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private var binding:ActivityMainBinding?=null  // faster to compiler-->time efficient

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding?.root)// root is the constraint layout whihc has individual ids

//        val flstartButton :FrameLayout=findViewById(R.id.flstart)<--traditional way
//        flstartButton.setOnClickListener

        binding?.flstart?.setOnClickListener{
            Toast.makeText(this,"here we will start excersice",Toast.LENGTH_SHORT).show()

        }

    }

    override fun onDestroy() {
        super.onDestroy()
            binding=null    // avoid memory leaks
    }
}