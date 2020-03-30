package edu.bjtu.sse.db.contract.model;

public class yaopin {
    private String disease;
    private String medicine;
    private String link;
    private String function;

    public yaopin(String disease, String medicine, String link, String instruction, String function) {
        this.disease=disease;
        this.medicine=medicine;
        this.link=link;
        this.instruction=instruction;
        this.function=function;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getInstruction() {
        return instruction;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    private String instruction;
}
