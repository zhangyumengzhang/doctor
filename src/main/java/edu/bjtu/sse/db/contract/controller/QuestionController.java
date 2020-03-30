package edu.bjtu.sse.db.contract.controller;

import edu.bjtu.sse.db.contract.daoImpl.QuestionDaoImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

@RestController
public class QuestionController {
    @RequestMapping("/question2")
    public String question2(@RequestParam String answer1) {
        HttpServletResponse response = null;
        QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
        return   questionDaoImpl.getQuestion2(answer1);
    }
    @RequestMapping("/question3")
    public String question3(@RequestParam String answer1,@RequestParam String answer2) {
        HttpServletResponse response = null;
        QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
        return   questionDaoImpl.getQuestion3(answer1,answer2);
    }
    @RequestMapping("/question4")
    public String question4(@RequestParam String answer1,@RequestParam String answer2,@RequestParam String answer3) {
        HttpServletResponse response = null;
        QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
        return   questionDaoImpl.getQuestion4(answer1,answer2,answer3);
    }
    @RequestMapping("/question5")
    public String question5(@RequestParam String answer1,@RequestParam String answer2,@RequestParam String answer3,@RequestParam String answer4) {
        HttpServletResponse response = null;
        QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
        return   questionDaoImpl.getQuestion5(answer1,answer2,answer3,answer4);
    }
    @RequestMapping("/question6")
    public String question6(@RequestParam String answer1,@RequestParam String answer2,@RequestParam String answer3,@RequestParam String answer4,@RequestParam String answer5) {
        HttpServletResponse response = null;
        QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
        return   questionDaoImpl.getQuestion6(answer1,answer2,answer3,answer4,answer5);
    }
    @RequestMapping("/question7")
    public String question7(@RequestParam String answer1,@RequestParam String answer2,@RequestParam String answer3,@RequestParam String answer4,@RequestParam String answer5,@RequestParam String answer6) {
    HttpServletResponse response = null;
    QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
    return   questionDaoImpl.getQuestion7(answer1,answer2,answer3,answer4,answer5,answer6);
}
    @RequestMapping("/question8")
    public String question8(@RequestParam String answer1,@RequestParam String answer2,@RequestParam String answer3,@RequestParam String answer4,@RequestParam String answer5,@RequestParam String answer6,@RequestParam String answer7) {
        HttpServletResponse response = null;
        QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
        return   questionDaoImpl.getQuestion8(answer1,answer2,answer3,answer4,answer5,answer6,answer7);
    }
    @RequestMapping("/question9")
    public String question9(@RequestParam String answer1,@RequestParam String answer2,@RequestParam String answer3,@RequestParam String answer4,@RequestParam String answer5,@RequestParam String answer6,@RequestParam String answer7,@RequestParam String answer8) {
        HttpServletResponse response = null;
        QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
        return   questionDaoImpl.getQuestion9(answer1,answer2,answer3,answer4,answer5,answer6,answer7,answer8);
    }
    @RequestMapping("/result")
    public String result(@RequestParam int id){
        HttpServletResponse response = null;
        QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
        return   questionDaoImpl.getResult(id);
    }
    @RequestMapping("/questionid4")
    public int questionid4(@RequestParam String answer1,@RequestParam String answer2,@RequestParam String answer3) {
        HttpServletResponse response = null;
        QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
        return   questionDaoImpl.getQuestionid4(answer1,answer2,answer3);
    }
    @RequestMapping("/questionid5")
    public int questionid5(@RequestParam String answer1,@RequestParam String answer2,@RequestParam String answer3,@RequestParam String answer4) {
        HttpServletResponse response = null;
        QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
        return   questionDaoImpl.getQuestionid5(answer1,answer2,answer3,answer4);
    }
    @RequestMapping("/questionid6")
    public int questionid6(@RequestParam String answer1,@RequestParam String answer2,@RequestParam String answer3,@RequestParam String answer4,@RequestParam String answer5) {
        HttpServletResponse response = null;
        QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
        return   questionDaoImpl.getQuestionid6(answer1,answer2,answer3,answer4,answer5);
    }
    @RequestMapping("/questionid7")
    public int questionid7(@RequestParam String answer1,@RequestParam String answer2,@RequestParam String answer3,@RequestParam String answer4,@RequestParam String answer5,@RequestParam String answer6) {
        HttpServletResponse response = null;
        QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
        return   questionDaoImpl.getQuestionid7(answer1,answer2,answer3,answer4,answer5,answer6);
    }
    @RequestMapping("/questionid8")
    public int questionid8(@RequestParam String answer1,@RequestParam String answer2,@RequestParam String answer3,@RequestParam String answer4,@RequestParam String answer5,@RequestParam String answer6,@RequestParam String answer7) {
        HttpServletResponse response = null;
        QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
        return   questionDaoImpl.getQuestionid8(answer1,answer2,answer3,answer4,answer5,answer6,answer7);
    }
    @RequestMapping("/questionid9")
    public int questionid9(@RequestParam String answer1,@RequestParam String answer2,@RequestParam String answer3,@RequestParam String answer4,@RequestParam String answer5,@RequestParam String answer6,@RequestParam String answer7,@RequestParam String answer8) {
        HttpServletResponse response = null;
        QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
        return   questionDaoImpl.getQuestionid9(answer1,answer2,answer3,answer4,answer5,answer6,answer7,answer8);
    }
    @RequestMapping("/qresult")
    public String qresult(@RequestParam String answer1,@RequestParam String answer2,@RequestParam String answer3,@RequestParam String answer4,@RequestParam String answer5,@RequestParam String answer6,@RequestParam String answer7,@RequestParam String answer8,@RequestParam String answer9){
        HttpServletResponse response = null;
        QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
        return   questionDaoImpl.getqResult(answer1,answer2,answer3,answer4,answer5,answer6,answer7,answer8,answer9);
    }
}