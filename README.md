# Tricky-Quiz

Project for [#30daysofkotlin](https://eventsonair.withgoogle.com/events/kotlin#)
## Description

It is simple true/false quiz app, but the colour and text of the choice buttons keeps changing randomly after every question. With a timer on, see for yourself how many questions you can answer correctly!

## Kotlin Concepts Used:

- String template: Updating timerText in Countdown Timer and scoreText in updateScore(). late-initialized properties: questionsClass and timer variables.
- Interoperability with Java: created two java classes( Question and QuestionsClass) whose instances are used in MainActivity.kt. 
- Lambda: startTimer variable holds a lambda expression. 
- Property access syntax: Getter method for questionsList in QuestionsClass is used as property in Mainactivity.kt.
- Named parameter: calls to updateScore() method contains named parameter "answer"
