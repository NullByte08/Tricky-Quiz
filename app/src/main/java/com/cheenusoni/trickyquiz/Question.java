package com.cheenusoni.trickyquiz;

public class Question {
    private String questionText;
    private boolean questionAnswer;

    public String getQuestionText() {
        return questionText;
    }

    public boolean getQuestionAnswer() {
        return questionAnswer;
    }

    Question(String q, boolean a) {
        questionText = q;
        questionAnswer = a;
    }
}
