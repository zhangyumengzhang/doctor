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
    @RequestMapping("/question10")
    public String question10(@RequestParam String answer1,@RequestParam String answer2,@RequestParam String answer3,@RequestParam String answer4,@RequestParam String answer5,@RequestParam String answer6,@RequestParam String answer7,@RequestParam String answer8,@RequestParam String answer9) {
        HttpServletResponse response = null;
        QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
        return   questionDaoImpl.getQuestion10(answer1,answer2,answer3,answer4,answer5,answer6,answer7,answer8,answer9);
    }
    @RequestMapping("/question11")
    public String question11(@RequestParam String answer1,@RequestParam String answer2,@RequestParam String answer3,@RequestParam String answer4,@RequestParam String answer5,@RequestParam String answer6,@RequestParam String answer7,@RequestParam String answer8,@RequestParam String answer9,@RequestParam String answer10) {
        HttpServletResponse response = null;
        QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
        return   questionDaoImpl.getQuestion11(answer1,answer2,answer3,answer4,answer5,answer6,answer7,answer8,answer9,answer10);
    }
    @RequestMapping("/question12")
    public String question12(@RequestParam String answer1,@RequestParam String answer2,@RequestParam String answer3,@RequestParam String answer4,@RequestParam String answer5,@RequestParam String answer6,@RequestParam String answer7,@RequestParam String answer8,@RequestParam String answer9,@RequestParam String answer10,@RequestParam String answer11) {
        HttpServletResponse response = null;
        QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
        return   questionDaoImpl.getQuestion12(answer1,answer2,answer3,answer4,answer5,answer6,answer7,answer8,answer9,answer10,answer11);
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
    @RequestMapping("/questionid10")
    public int questionid10(@RequestParam String answer1,@RequestParam String answer2,@RequestParam String answer3,@RequestParam String answer4,@RequestParam String answer5,@RequestParam String answer6,@RequestParam String answer7,@RequestParam String answer8,@RequestParam String answer9) {
        HttpServletResponse response = null;
        QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
        return   questionDaoImpl.getQuestionid10(answer1,answer2,answer3,answer4,answer5,answer6,answer7,answer8,answer9);
    }
    @RequestMapping("/questionid11")
    public int questionid11(@RequestParam String answer1,@RequestParam String answer2,@RequestParam String answer3,@RequestParam String answer4,@RequestParam String answer5,@RequestParam String answer6,@RequestParam String answer7,@RequestParam String answer8,@RequestParam String answer9,@RequestParam String answer10) {
        HttpServletResponse response = null;
        QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
        return   questionDaoImpl.getQuestionid11(answer1,answer2,answer3,answer4,answer5,answer6,answer7,answer8,answer9,answer10);
    }
    @RequestMapping("/qresult")
    public String qresult(@RequestParam String answer1,@RequestParam String answer2,@RequestParam String answer3,@RequestParam String answer4,@RequestParam String answer5,@RequestParam String answer6,@RequestParam String answer7,@RequestParam String answer8,@RequestParam String answer9,@RequestParam String answer10,@RequestParam String answer11,@RequestParam String answer12){
        HttpServletResponse response = null;
        QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
        return   questionDaoImpl.getqResult(answer1,answer2,answer3,answer4,answer5,answer6,answer7,answer8,answer9,answer10,answer11,answer12);
    }
    @RequestMapping("/questionman2")
    public String questionman2(@RequestParam String answer1) {
        HttpServletResponse response = null;
        QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
        return   questionDaoImpl.getQuestionman2(answer1);
    }
    @RequestMapping("/questionman3")
    public String questionman3(@RequestParam String answer1,@RequestParam String answer2) {
        HttpServletResponse response = null;
        QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
        return   questionDaoImpl.getQuestionman3(answer1,answer2);
    }
    @RequestMapping("/questionman4")
    public String questionman4(@RequestParam String answer1,@RequestParam String answer2,@RequestParam String answer3) {
        HttpServletResponse response = null;
        QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
        return   questionDaoImpl.getQuestionman4(answer1,answer2,answer3);
    }
    @RequestMapping("/questionman5")
    public String questionman5(@RequestParam String answer1,@RequestParam String answer2,@RequestParam String answer3,@RequestParam String answer4) {
        HttpServletResponse response = null;
        QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
        return   questionDaoImpl.getQuestionman5(answer1,answer2,answer3,answer4);
    }
    @RequestMapping("/questionman6")
    public String questionman6(@RequestParam String answer1,@RequestParam String answer2,@RequestParam String answer3,@RequestParam String answer4,@RequestParam String answer5) {
        HttpServletResponse response = null;
        QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
        return   questionDaoImpl.getQuestionman6(answer1,answer2,answer3,answer4,answer5);
    }
    @RequestMapping("/questionman7")
    public String questionman7(@RequestParam String answer1,@RequestParam String answer2,@RequestParam String answer3,@RequestParam String answer4,@RequestParam String answer5,@RequestParam String answer6) {
        HttpServletResponse response = null;
        QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
        return   questionDaoImpl.getQuestionman7(answer1,answer2,answer3,answer4,answer5,answer6);
    }
    @RequestMapping("/questionman8")
    public String questionman8(@RequestParam String answer1,@RequestParam String answer2,@RequestParam String answer3,@RequestParam String answer4,@RequestParam String answer5,@RequestParam String answer6,@RequestParam String answer7) {
        HttpServletResponse response = null;
        QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
        return   questionDaoImpl.getQuestionman8(answer1,answer2,answer3,answer4,answer5,answer6,answer7);
    }
    @RequestMapping("/questionman9")
    public String questionman9(@RequestParam String answer1,@RequestParam String answer2,@RequestParam String answer3,@RequestParam String answer4,@RequestParam String answer5,@RequestParam String answer6,@RequestParam String answer7,@RequestParam String answer8) {
        HttpServletResponse response = null;
        QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
        return   questionDaoImpl.getQuestionman9(answer1,answer2,answer3,answer4,answer5,answer6,answer7,answer8);
    }
    @RequestMapping("/questionman10")
    public String questionman10(@RequestParam String answer1,@RequestParam String answer2,@RequestParam String answer3,@RequestParam String answer4,@RequestParam String answer5,@RequestParam String answer6,@RequestParam String answer7,@RequestParam String answer8,@RequestParam String answer9) {
        HttpServletResponse response = null;
        QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
        return   questionDaoImpl.getQuestionman10(answer1,answer2,answer3,answer4,answer5,answer6,answer7,answer8,answer9);
    }
    @RequestMapping("/questionman11")
    public String questionman11(@RequestParam String answer1,@RequestParam String answer2,@RequestParam String answer3,@RequestParam String answer4,@RequestParam String answer5,@RequestParam String answer6,@RequestParam String answer7,@RequestParam String answer8,@RequestParam String answer9,@RequestParam String answer10) {
        HttpServletResponse response = null;
        QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
        return   questionDaoImpl.getQuestionman11(answer1,answer2,answer3,answer4,answer5,answer6,answer7,answer8,answer9,answer10);
    }
    @RequestMapping("/questionman12")
    public String questionman12(@RequestParam String answer1,@RequestParam String answer2,@RequestParam String answer3,@RequestParam String answer4,@RequestParam String answer5,@RequestParam String answer6,@RequestParam String answer7,@RequestParam String answer8,@RequestParam String answer9,@RequestParam String answer10,@RequestParam String answer11) {
        HttpServletResponse response = null;
        QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
        return   questionDaoImpl.getQuestionman12(answer1,answer2,answer3,answer4,answer5,answer6,answer7,answer8,answer9,answer10,answer11);
    }
    @RequestMapping("/resultman")
    public String resultman(@RequestParam int id){
        HttpServletResponse response = null;
        QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
        return   questionDaoImpl.getResultman(id);
    }
    @RequestMapping("/questionidman4")
    public int questionidman4(@RequestParam String answer1,@RequestParam String answer2,@RequestParam String answer3) {
        HttpServletResponse response = null;
        QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
        return   questionDaoImpl.getQuestionidman4(answer1,answer2,answer3);
    }
    @RequestMapping("/questionidman5")
    public int questionidman5(@RequestParam String answer1,@RequestParam String answer2,@RequestParam String answer3,@RequestParam String answer4) {
        HttpServletResponse response = null;
        QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
        return   questionDaoImpl.getQuestionidman5(answer1,answer2,answer3,answer4);
    }
    @RequestMapping("/questionidman6")
    public int questionidman6(@RequestParam String answer1,@RequestParam String answer2,@RequestParam String answer3,@RequestParam String answer4,@RequestParam String answer5) {
        HttpServletResponse response = null;
        QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
        return   questionDaoImpl.getQuestionidman6(answer1,answer2,answer3,answer4,answer5);
    }
    @RequestMapping("/questionidman7")
    public int questionidman7(@RequestParam String answer1,@RequestParam String answer2,@RequestParam String answer3,@RequestParam String answer4,@RequestParam String answer5,@RequestParam String answer6) {
        HttpServletResponse response = null;
        QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
        return   questionDaoImpl.getQuestionidman7(answer1,answer2,answer3,answer4,answer5,answer6);
    }
    @RequestMapping("/questionidman8")
    public int questionidman8(@RequestParam String answer1,@RequestParam String answer2,@RequestParam String answer3,@RequestParam String answer4,@RequestParam String answer5,@RequestParam String answer6,@RequestParam String answer7) {
        HttpServletResponse response = null;
        QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
        return   questionDaoImpl.getQuestionidman8(answer1,answer2,answer3,answer4,answer5,answer6,answer7);
    }
    @RequestMapping("/questionidman9")
    public int questionidman9(@RequestParam String answer1,@RequestParam String answer2,@RequestParam String answer3,@RequestParam String answer4,@RequestParam String answer5,@RequestParam String answer6,@RequestParam String answer7,@RequestParam String answer8) {
        HttpServletResponse response = null;
        QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
        return   questionDaoImpl.getQuestionidman9(answer1,answer2,answer3,answer4,answer5,answer6,answer7,answer8);
    }
    @RequestMapping("/questionidman10")
    public int questionidman10(@RequestParam String answer1,@RequestParam String answer2,@RequestParam String answer3,@RequestParam String answer4,@RequestParam String answer5,@RequestParam String answer6,@RequestParam String answer7,@RequestParam String answer8,@RequestParam String answer9) {
        HttpServletResponse response = null;
        QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
        return   questionDaoImpl.getQuestionidman10(answer1,answer2,answer3,answer4,answer5,answer6,answer7,answer8,answer9);
    }
    @RequestMapping("/questionidman11")
    public int questionidman11(@RequestParam String answer1,@RequestParam String answer2,@RequestParam String answer3,@RequestParam String answer4,@RequestParam String answer5,@RequestParam String answer6,@RequestParam String answer7,@RequestParam String answer8,@RequestParam String answer9,@RequestParam String answer10) {
        HttpServletResponse response = null;
        QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
        return   questionDaoImpl.getQuestionidman11(answer1,answer2,answer3,answer4,answer5,answer6,answer7,answer8,answer9,answer10);
    }
    @RequestMapping("/qresultman")
    public String qresultmna(@RequestParam String answer1,@RequestParam String answer2,@RequestParam String answer3,@RequestParam String answer4,@RequestParam String answer5,@RequestParam String answer6,@RequestParam String answer7,@RequestParam String answer8,@RequestParam String answer9,@RequestParam String answer10,@RequestParam String answer11){
        HttpServletResponse response = null;
        QuestionDaoImpl questionDaoImpl = new QuestionDaoImpl();
        return   questionDaoImpl.getqResultman(answer1,answer2,answer3,answer4,answer5,answer6,answer7,answer8,answer9,answer10,answer11);
    }
}