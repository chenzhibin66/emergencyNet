package com.calvin.controller;

import com.calvin.biz.GlobalBiz;
import com.calvin.dao.AdminDao;
import com.calvin.entity.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

/**
 * @author Calvin
 * @Description:
 */
@Controller("globalController")
public class GlobalController {

    @Autowired
    private GlobalBiz globalBiz;

    @RequestMapping("/to_login")
    public String toLogin() {
        return "login";
    }

    @RequestMapping("/login")
    public String login(HttpSession session, @RequestParam String sn, @RequestParam String password) {
        Admin admin = globalBiz.login(sn, password);
        if (admin == null) {
            return "redirect:to_login";
        }
        session.setAttribute("admin",admin);
        return "redirect:/sos/sos_list";
    }

}
