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

}
