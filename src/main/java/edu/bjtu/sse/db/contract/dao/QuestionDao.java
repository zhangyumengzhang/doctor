package edu.bjtu.sse.db.contract.dao;

import edu.bjtu.sse.db.contract.model.Question;
import edu.bjtu.sse.db.contract.model.User;

import java.util.ArrayList;

public interface QuestionDao {
    String  getQuestion2(String answer1);
    String  getQuestion3(String answer1,String answer2);
    String  getQuestion4(String answer1,String answer2,String answer3);
    String  getQuestion5(String answer1,String answer2,String answer3,String answer4);
}
