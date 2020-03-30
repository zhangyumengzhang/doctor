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
    int  getQuestionid4(String answer1,String answer2,String answer3);
    int  getQuestionid5(String answer1,String answer2,String answer3,String answer4);
    int  getQuestionid6(String answer1,String answer2,String answer3,String answer4,String answer5);
    int  getQuestionid7(String answer1,String answer2,String answer3,String answer4,String answer5,String answer6);
    int  getQuestionid8(String answer1,String answer2,String answer3,String answer4,String answer5,String answer6,String answer7);
    int  getQuestionid9(String answer1,String answer2,String answer3,String answer4,String answer5,String answer6,String answer7,String answer8);
    String  getqResult(String answer1,String answer2,String answer3,String answer4,String answer5,String answer6,String answer7,String answer8,String answer9);
}

