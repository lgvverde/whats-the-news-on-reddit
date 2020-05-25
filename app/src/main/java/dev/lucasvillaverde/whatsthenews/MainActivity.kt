package dev.lucasvillaverde.whatsthenews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.whatsthenews.R

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ft = supportFragmentManager.beginTransaction()
    }
}
