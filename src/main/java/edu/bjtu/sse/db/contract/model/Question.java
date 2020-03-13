package edu.bjtu.sse.db.contract.model;

public class Question {
    private int id;

    public Question(int id, String q1, String a1, String q2, String a2, String q3, String a3, String q4, String a4, String q5, String a5, String q6, String a6, String q7, String a7, String q8, String a8, String q9, String a9, String result) {
   this.id=id;
   this.a1=a1;
   this.a2 =a2;
   this.a3=a3;
        this.a4=a4;
        this.a5 =a5;
        this.a6=a6;
        this.a7=a7;
        this.a8 =a8;
        this.a9=a9;
        this.q1=q1;
        this.q2 =q2;
        this.q3=q3;
        this.q4=q4;
        this.q5 =q5;
        this.q6=q6;
        this.q7=q7;
        this.q8 =q8;
        this.q9=q9;
        this.result=result;
    }

    public String getQ1() {
        return q1;
    }

    public void setQ1(String q1) {
        this.q1 = q1;
    }

    private String q1;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getA1() {
        return a1;
    }

    public void setA1(String a1) {
        this.a1 = a1;
    }

    public String getQ2() {
        return q2;
    }

    public void setQ2(String q2) {
        this.q2 = q2;
    }

    public String getA2() {
        return a2;
    }

    public void setA2(String a2) {
        this.a2 = a2;
    }

    public String getQ3() {
        return q3;
    }

    public void setQ3(String q3) {
        this.q3 = q3;
    }

    public String getA3() {
        return a3;
    }

    public void setA3(String a3) {
        this.a3 = a3;
    }

    public String getQ4() {
        return q4;
    }

    public void setQ4(String q4) {
        this.q4 = q4;
    }

    public String getA4() {
        return a4;
    }

    public void setA4(String a4) {
        this.a4 = a4;
    }

    public String getQ5() {
        return q5;
    }

    public void setQ5(String q5) {
        this.q5 = q5;
    }

    public String getA5() {
        return a5;
    }

    public void setA5(String a5) {
        this.a5 = a5;
    }

    public String getQ6() {
        return q6;
    }

    public void setQ6(String q6) {
        this.q6 = q6;
    }

    public String getA6() {
        return a6;
    }

    public void setA6(String a6) {
        this.a6 = a6;
    }

    public String getQ7() {
        return q7;
    }

    public void setQ7(String q7) {
        this.q7 = q7;
    }

    public String getA7() {
        return a7;
    }

    public void setA7(String a7) {
        this.a7 = a7;
    }

    public String getQ8() {
        return q8;
    }

    public void setQ8(String q8) {
        this.q8 = q8;
    }

    public String getA8() {
        return a8;
    }

    public void setA8(String a8) {
        this.a8 = a8;
    }

    public String getQ9() {
        return q9;
    }

    public void setQ9(String q9) {
        this.q9 = q9;
    }

    public String getA9() {
        return a9;
    }

    public void setA9(String a9) {
        this.a9 = a9;
    }

    private String a1;
    private String q2;
    private String a2;
    private String q3;
    private String a3;
    private String q4;
    private String a4;
    private String q5;
    private String a5;
    private String q6;
    private String a6;
    private String q7;
    private String a7;
    private String q8;
    private String a8;
    private String q9;
    private String a9;

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    private String result;
}
