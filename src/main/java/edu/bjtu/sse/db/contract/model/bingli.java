package edu.bjtu.sse.db.contract.model;

import java.sql.Time;

public class bingli {
    private String name;

    public bingli(String name, String time, String result) {
        this.name=name;
        this.result=result;
        this.time=time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    private String time;
    private String result;
}
