package edu.bjtu.sse.db.contract.dao;

import edu.bjtu.sse.db.contract.model.Question;
import edu.bjtu.sse.db.contract.model.User;

import java.util.ArrayList;

public interface QuestionDao {
    String  getResult(int id);
    String  getQuestion2(String answer1);
    String  getQuestion3(String answer1,String answer2);
    String  getQuestion4(String answer1,String answer2,String answer3);
    String  getQuestion5(String answer1,String answer2,String answer3,String answer4);
    String  getQuestion6(String answer1,String answer2,String answer3,String answer4,String answer5);
    String  getQuestion7(String answer1,String answer2,String answer3,String answer4,String answer5,String answer6);
    String  getQuestion8(String answer1,String answer2,String answer3,String answer4,String answer5,String answer6,String answer7);
    String  getQuestion9(String answer1,String answer2,String answer3,String answer4,String answer5,String answer6,String answer7,String answer8);
    String  getQuestion10(String answer1,String answer2,String answer3,String answer4,String answer5,String answer6,String answer7,String answer8,String answer9);
    String  getQuestion11(String answer1,String answer2,String answer3,String answer4,String answer5,String answer6,String answer7,String answer8,String answer9,String answer10);
    String  getQuestion12(String answer1,String answer2,String answer3,String answer4,String answer5,String answer6,String answer7,String answer8,String answer9,String answer10,String answer11);
    int  getQuestionid4(String answer1,String answer2,String answer3);
    int  getQuestionid5(String answer1,String answer2,String answer3,String answer4);
    int  getQuestionid6(String answer1,String answer2,String answer3,String answer4,String answer5);
    int  getQuestionid7(String answer1,String answer2,String answer3,String answer4,String answer5,String answer6);
    int  getQuestionid8(String answer1,String answer2,String answer3,String answer4,String answer5,String answer6,String answer7);
    int  getQuestionid9(String answer1,String answer2,String answer3,String answer4,String answer5,String answer6,String answer7,String answer8);
    int  getQuestionid10(String answer1,String answer2,String answer3,String answer4,String answer5,String answer6,String answer7,String answer8,String answer9);
    int  getQuestionid11(String answer1,String answer2,String answer3,String answer4,String answer5,String answer6,String answer7,String answer8,String answer9,String answer10);
    int  getQuestionid12(String answer1,String answer2,String answer3,String answer4,String answer5,String answer6,String answer7,String answer8,String answer9,String answer10,String answer11);
    String  getqResult(String answer1,String answer2,String answer3,String answer4,String answer5,String answer6,String answer7,String answer8,String answer9,String answer10,String answer11,String answer12);
    String  getResultman(int id);
    String  getQuestionman2(String answer1);
    String  getQuestionman3(String answer1,String answer2);
    String  getQuestionman4(String answer1,String answer2,String answer3);
    String  getQuestionman5(String answer1,String answer2,String answer3,String answer4);
    String  getQuestionman6(String answer1,String answer2,String answer3,String answer4,String answer5);
    String  getQuestionman7(String answer1,String answer2,String answer3,String answer4,String answer5,String answer6);
    String  getQuestionman8(String answer1,String answer2,String answer3,String answer4,String answer5,String answer6,String answer7);
    String  getQuestionman9(String answer1,String answer2,String answer3,String answer4,String answer5,String answer6,String answer7,String answer8);
    String  getQuestionman10(String answer1,String answer2,String answer3,String answer4,String answer5,String answer6,String answer7,String answer8,String answer9);
    String  getQuestionman11(String answer1,String answer2,String answer3,String answer4,String answer5,String answer6,String answer7,String answer8,String answer9,String answer10);
    String  getQuestionman12(String answer1,String answer2,String answer3,String answer4,String answer5,String answer6,String answer7,String answer8,String answer9,String answer10,String answer11);
    int  getQuestionidman4(String answer1,String answer2,String answer3);
    int  getQuestionidman5(String answer1,String answer2,String answer3,String answer4);
    int  getQuestionidman6(String answer1,String answer2,String answer3,String answer4,String answer5);
    int  getQuestionidman7(String answer1,String answer2,String answer3,String answer4,String answer5,String answer6);
    int  getQuestionidman8(String answer1,String answer2,String answer3,String answer4,String answer5,String answer6,String answer7);
    int  getQuestionidman9(String answer1,String answer2,String answer3,String answer4,String answer5,String answer6,String answer7,String answer8);
    int  getQuestionidman10(String answer1,String answer2,String answer3,String answer4,String answer5,String answer6,String answer7,String answer8,String answer9);
    int  getQuestionidman11(String answer1,String answer2,String answer3,String answer4,String answer5,String answer6,String answer7,String answer8,String answer9,String answer10);
    int  getQuestionidman12(String answer1,String answer2,String answer3,String answer4,String answer5,String answer6,String answer7,String answer8,String answer9,String answer10,String answer11);
    String  getqResultman(String answer1,String answer2,String answer3,String answer4,String answer5,String answer6,String answer7,String answer8,String answer9,String answer10,String answer11);
}


