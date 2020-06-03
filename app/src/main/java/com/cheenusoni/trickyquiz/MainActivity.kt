package com.cheenusoni.trickyquiz

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var score: Int = 0
    private var questionNumber: Int = 0;
    private lateinit var questionsClass: QuestionsClass
    private lateinit var timer:CountDownTimer

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        questionsClass = QuestionsClass()
        updateQuestion()

        startButton.setOnClickListener {
            choice1Button.isEnabled = true
            choice2Button.isEnabled = true
            startTimer(true)
            startButton.visibility = View.INVISIBLE
            scoreText.text = "0/10"
            score = 0
            questionNumber = 0
            timerText.text = "00:30"
            updateQuestion()
        }

        choice1Button.setOnClickListener {
            updateScore(choice1Button.text.toString())
            questionNumber++
            updateQuestion()
            randomizeButtons()
        }

        choice2Button.setOnClickListener {
            updateScore(choice2Button.text.toString())
            questionNumber++
            updateQuestion()
            randomizeButtons()
        }

        timer = object : CountDownTimer(30000, 1000) {

            override fun onTick(millisUntilFinished: Long) {
                if(millisUntilFinished/1000<10){
                    timerText.text = "00:0${millisUntilFinished/1000}"
                }
                else {
                    timerText.text = "00:${millisUntilFinished / 1000}"
                }
            }

            override fun onFinish() {
                timerText.text = "00:00"
                startButton.visibility = View.VISIBLE
                choice1Button.isEnabled = false
                choice2Button.isEnabled = false
                questionText.text = "Time Over!"
            }
        }

    }

    fun startTimer(boolean: Boolean) {
        if(boolean){
            timer.start()
        }
        else{
            timer.cancel()
        }
    }

    fun updateQuestion() {
        if (questionNumber < 10) {
            questionText.text = questionsClass.questionsList.get(questionNumber).questionText
        }
        else{
            choice1Button.isEnabled = false
            choice2Button.isEnabled = false
            questionText.text = "Quiz Completed!"
            startButton.visibility = View.VISIBLE
            startTimer(false)
        }
    }

    fun randomizeButtons() {
        var value = (0..1).random()
        if (value == 1) {
            choice1Button.text = "TRUE"
            choice2Button.text = "FALSE"
        } else {
            choice1Button.text = "FALSE"
            choice2Button.text = "TRUE"
        }
        var colour = (0..1).random()
        if (colour == 1) {
            choice1Button.setBackgroundColor(Color.RED)
            choice2Button.setBackgroundColor(Color.GREEN)
        } else {
            choice2Button.setBackgroundColor(Color.RED)
            choice1Button.setBackgroundColor(Color.GREEN)
        }
    }

    fun updateScore(answer: String) {
        if (questionNumber < 10) {
            if (answer.equals("TRUE") && questionsClass.questionsList.get(questionNumber).questionAnswer) {
                score++
            } else if (answer.equals("FALSE") && !(questionsClass.questionsList.get(questionNumber).questionAnswer)) {
                score++
            }
            scoreText.text = "$score/10"
        }
    }
}
