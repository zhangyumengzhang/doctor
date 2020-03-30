package edu.bjtu.sse.db.contract.controller;

import edu.bjtu.sse.db.contract.daoImpl.yaopinDaoImpl;
import edu.bjtu.sse.db.contract.model.yaopin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;

@RestController
public class yaopinController {
    @RequestMapping("/yaopin")
    public ArrayList<yaopin> insert(@RequestParam String result) {
        HttpServletResponse response = null;
        yaopinDaoImpl yaopindaoImpl = new yaopinDaoImpl();
        return yaopindaoImpl.getyaobyresult(result);
    }
}
