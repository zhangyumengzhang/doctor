package edu.bjtu.sse.db.contract.controller;

import edu.bjtu.sse.db.contract.daoImpl.bingliDaoImpl;
import edu.bjtu.sse.db.contract.model.bingli;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.sql.Time;
import java.util.ArrayList;
@RestController
public class bingliController {
    @RequestMapping("/charu")
    public boolean insert(@RequestParam String name, @RequestParam String time, @RequestParam String result, @RequestParam String content) {
        HttpServletResponse response = null;
        bingliDaoImpl binglidaoImpl = new bingliDaoImpl();
        if(binglidaoImpl.insertbingli(name,time,result,content)){
            return true;
        }else{
            return false;
        }
    }

    @RequestMapping("/getall")
    public ArrayList<bingli> search(@RequestParam String name) {
        HttpServletResponse response = null;
        bingliDaoImpl binglidaoImpl = new bingliDaoImpl();
        return binglidaoImpl.getAllbingli(name);
    }

}
