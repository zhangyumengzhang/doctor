package edu.bjtu.sse.db.contract.controller;

import edu.bjtu.sse.db.contract.daoImpl.UserDaoImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;

public class bingliController {
    @RequestMapping("/insert")
    public String insert(@RequestParam String name, @RequestParam String password) {
        HttpServletResponse response = null;
        UserDaoImpl userDaoImpl = new UserDaoImpl();
        boolean b=userDaoImpl.login(name,password);
        if(b==true){
            return "登录成功";
        }else{
            return "登录失败";
        }
    }

    @RequestMapping("/search")
    public String search(@RequestParam String name, @RequestParam String password) {
        HttpServletResponse response = null;
        UserDaoImpl userDaoImpl = new UserDaoImpl();
        boolean b=userDaoImpl.login(name,password);
        if(b==true){
            return "登录成功";
        }else{
            return "登录失败";
        }
    }
}
