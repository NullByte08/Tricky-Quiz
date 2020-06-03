package com.cheenusoni.trickyquiz;

import java.util.ArrayList;

public class QuestionsClass {

    public ArrayList<Question> getQuestionsList() {
        return questionsList;
    }

    private ArrayList<Question> questionsList;
    QuestionsClass(){
        questionsList  = new ArrayList<>();
        questionsList.add(new Question("1. Cyclones spin in a clockwise direction in the southern hemisphere",true));
        questionsList.add(new Question("2. Goldfish only have a memory of three seconds",false));
        questionsList.add(new Question("3. The capital of Libya is Benghazi", false));
        questionsList.add(new Question("4. Brazil is the only country in the Americas to have the official language of Portuguese",true));
        questionsList.add(new Question("5. The Channel Tunnel is the longest rail tunnel in the world",false));
        questionsList.add(new Question("6. Darth Vader famously says the line “Luke, I am your father” in The Empire Strikes Back",false));
        questionsList.add(new Question("7. Olivia Newton-John represented the UK in the Eurovision Song Contest in 1974, the year ABBA won with “Waterloo”",true));
        questionsList.add(new Question("8. Stephen Hawking declined a knighthood from the Queen",true));
        questionsList.add(new Question("9. The highest mountain in England is Ben Nevis",false));
        questionsList.add(new Question("10. Nicolas Cage and Michael Jackson both married the same woman",true));
    }

}
