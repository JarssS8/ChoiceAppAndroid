package com.example.random_choice_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onClick(v: View) {
        var intent: Intent? = null
        val option = v.id
        when (option) {
            R.id.btRandomNumber -> {
                intent = Intent(this, RandomNumber::class.java)
            }
            R.id.btCoinFlip -> {
                intent = Intent(this, CoinFlip::class.java)
            }
            R.id.btRandomName -> {
                intent = Intent(this, RandomName::class.java)
            }
            R.id.btRoullete -> {
                intent = Intent(this, Roulette::class.java)
            }

        }


        startActivity(intent)

    }
}
