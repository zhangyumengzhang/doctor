package edu.bjtu.sse.db.contract.controller;

import edu.bjtu.sse.db.contract.daoImpl.UserDaoImpl;
import edu.bjtu.sse.db.contract.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import javax.servlet.http.HttpServletResponse;


@RestController
public class LoginAndRegisterController {

    @RequestMapping("/login")
    public String login(@RequestParam String name, @RequestParam String password) {
        HttpServletResponse response = null;
        UserDaoImpl userDaoImpl = new UserDaoImpl();
        boolean b=userDaoImpl.login(name,password);
       if(b==true){
           return "登录成功";
      }else{
           return "登录失败";
       }
    }

    @RequestMapping("/register")
    public String register(@RequestParam String name, @RequestParam String password, @RequestParam String gender,@RequestParam String age) {
        UserDaoImpl userDaoImpl = new UserDaoImpl();
        User user = userDaoImpl.getUserByName(name);
        if (user != null)
            return "用户名已存在";

        if (userDaoImpl.insertUser(name, password,gender,age))
            return "注册成功";

        return "注册失败";
    }
    @RequestMapping("/update")
    public String update(@RequestParam String name, @RequestParam String password) {
        UserDaoImpl userDaoImpl = new UserDaoImpl();
        User user = userDaoImpl.getUserByName(name);
        if (user == null)
            return "用户名不存在";
        else if( userDaoImpl.updateUserPassword(name, password)){

            return "修改成功";
        }

        return "修改失败";
    }
    @RequestMapping("/getinformation")
    public User getinformation(@RequestParam String name) {
        UserDaoImpl userDaoImpl = new UserDaoImpl();
        User user = userDaoImpl.getUserByName(name);
        if (user == null)
            return null;
        else {
            return user;
        }
    }
}
