package com.calvin.controller;

import com.calvin.biz.DisasterPeopleBiz;
import com.calvin.dto.DisasterLoginInfo;
import com.calvin.dto.OkInfo;
import com.calvin.entity.DisasterPeople;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;


/**
 * @author Calvin
 * @Description:
 */
@Controller("disasterPeopleController")
@RequestMapping("/disaster")
public class DisasterPeopleController {

    @Autowired
    private DisasterPeopleBiz disasterPeopleBiz;

    @ResponseBody
    @RequestMapping("/Register")
    public OkInfo register(HttpServletRequest request) {
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        DisasterPeople disasterPeople = disasterPeopleBiz.get(account);
        if (disasterPeople != null) {
            return new OkInfo(2, "该账号已经存在!");
        } else {
            DisasterPeople disasterPeople1 = new DisasterPeople();
            disasterPeople1.setAccount(account);
            disasterPeople1.setPassword(password);
            disasterPeopleBiz.add(disasterPeople1);
            return new OkInfo(1, "注册成功!");
        }
    }

    @ResponseBody
    @RequestMapping("/login")
    public DisasterLoginInfo login(HttpServletRequest request) {
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        DisasterPeople disasterPeople = disasterPeopleBiz.get(account);
        if (disasterPeople != null && disasterPeople.getPassword().equals(password)) {
            return new DisasterLoginInfo(1, "登录成功!", disasterPeople);
        } else {
            return new DisasterLoginInfo(0, "登录失败!", null);
        }
    }

    @ResponseBody
    @RequestMapping("/queryAllPeople")
    public List<DisasterPeople> queryAllPeople() {
        List<DisasterPeople> list = new ArrayList<>();
        list = disasterPeopleBiz.getAll();
        return list;

    }
}
