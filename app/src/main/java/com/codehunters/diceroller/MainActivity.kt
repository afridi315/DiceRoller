package com.codehunters.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.core.text.isDigitsOnly
import androidx.core.widget.ImageViewCompat
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var diceImage: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener{ rollDice() }

        val countButton: Button = findViewById(R.id.count_button)
        countButton.setOnClickListener { countUp() }

        diceImage = findViewById(R.id.diceImage)

    }

    private fun rollDice() {

        //Toast.makeText(this, "Button clicked!", Toast.LENGTH_SHORT).show()

       /* val resultText: TextView = findViewById(R.id.result_text)
        resultText.text = "Dice Rolled!"


        resultText.text = randomInt.toString()*/

        val drawableResources = when(Random().nextInt(6) + 1) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResources)

    }

    private fun countUp() {

        /*val resultText: TextView = findViewById(R.id.result_text)   // initialize

        if (!resultText.text.isDigitsOnly()) {  // If resultText is not a number, set it to 1
            resultText.text = "1"
        } else {                                // Increase number until 6
            var resultInt = resultText.text.toString().toInt()
            if (resultInt < 6) {
                resultInt++
                resultText.text = resultInt.toString()
            }
        }*/

    }

}
