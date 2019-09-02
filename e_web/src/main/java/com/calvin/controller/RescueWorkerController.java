package com.calvin.controller;

import com.calvin.biz.RescueWorkerBiz;
import com.calvin.dto.OkInfo;
import com.calvin.dto.RescueWorkerLoginInfo;
import com.calvin.entity.RescueWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
@Controller("rescueWorkerController")
@RequestMapping("/rescue")
public class RescueWorkerController {

    @Autowired
    private RescueWorkerBiz rescueWorkerBiz;

    @ResponseBody
    @RequestMapping("/register")
    public OkInfo register(HttpServletRequest request) {
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        RescueWorker rescueWorker = rescueWorkerBiz.get(account);
        if (rescueWorker != null) {
            return new OkInfo(2, "该账号已经存在!");
        } else {
            RescueWorker rescueWorker1 = new RescueWorker();
            rescueWorker1.setAccount(account);
            rescueWorker1.setPassword(password);
            rescueWorkerBiz.add(rescueWorker1);
            return new OkInfo(1, "注册成功!");
        }
    }

    @ResponseBody
    @RequestMapping("/login")
    public RescueWorkerLoginInfo login(HttpServletRequest request) {
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        RescueWorker rescueWorker = rescueWorkerBiz.get(account);
        if (rescueWorker != null && rescueWorker.getPassword().equals(password)) {
            return new RescueWorkerLoginInfo(1, "登录成功!", rescueWorker);
        } else {
            return new RescueWorkerLoginInfo(0, "登录失败!", null);
        }
    }

}
