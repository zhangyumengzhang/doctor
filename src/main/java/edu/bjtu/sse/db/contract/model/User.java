package edu.bjtu.sse.db.contract.model;

import edu.bjtu.sse.db.contract.daoImpl.UserDaoImpl;

public class User {
    public static int idCount = 0;
    //静态代码块，用于项目一开始运行时，从数据库中读取最大的id，之后插入新user时id自动递增
    static{
        UserDaoImpl userDaoImpl = new UserDaoImpl();
        int biggestId = userDaoImpl.getUserBiggestId();
        if(biggestId == 0)
            idCount = 1;
        else
            idCount = biggestId + 1;
    }

    private int uId;

    private String name;
    private String password;
    private String gender;
    private String age;

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


    public User() {
    }

    public User(int uId, String name, String password,String gender,String age) {
        this.uId = uId;
        this.name = name;
        this.password = password;
        this.gender = gender;
        this.age=age;
    }

    public int getUid() {
        return uId;
    }

    public void setUid(int uId) {
        this.uId = uId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
