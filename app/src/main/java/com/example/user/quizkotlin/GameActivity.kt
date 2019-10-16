package com.example.user.quizkotlin

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.AppCompatButton
import android.widget.Button

class GameActivity : AppCompatActivity() {
    var score = 0
    fun displayScore()
    {
        var scoreButton = findViewById(R.id.score) as Button

        var scoreString:String = score.toString()

        scoreButton.text = scoreString
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        var i = 0
        while( i < 3) {
            val answer: String = "2007"

            val changeQuestion = findViewById(R.id.question) as Button
            changeQuestion.text = "When did LED ZEPPELIN reunite for one last concert in the uk?"

            var optionA = findViewById(R.id.optiona) as Button
            optionA.text = "2005"

            optionA.setOnClickListener {
                if (answer == optionA.text)
                    score++
                val intent = Intent(this, GameOverActivity::class.java)
              //  startActivity(intent)
            }

            var optionB = findViewById(R.id.optionb) as Button
            optionB.text = "2007"

            optionB.setOnClickListener {
                if (answer == optionB.text)
                    score++
                val intent = Intent(this, GameOverActivity::class.java)
               // startActivity(intent)
            }

            var optionC = findViewById(R.id.optionc) as Button
            optionC.text = "2008"
            optionC.setOnClickListener {
                if (answer == optionC.text)
                    score++
                val intent = Intent(this, GameOverActivity::class.java)
                //startActivity(intent)
            }

            i++
        }
       // displayScore()
    }

    fun questionmethod() = object
    {
        val questionId : Int = 100
        val questionEnunt : String = "WHen did Led Zeppelin reunion take place?"
        val questionAnswer : Int = 2007
        val questionoptionA : Int = 2007
        val questionoptionB : Int = 2006
        val questionoptionC : Int = 2011

    }
//startActivity(Intent(this@CurrentClassName,RequiredClassName::class.java)
}
