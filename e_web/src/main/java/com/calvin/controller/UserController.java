package com.calvin.controller;

import com.calvin.biz.UserDaoBiz;
import com.calvin.dto.UserrLoginInfo;
import com.calvin.dto.OkInfo;
import com.calvin.entity.User;
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
@Controller("userController")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserDaoBiz userDaoBiz;

    @ResponseBody
    @RequestMapping("/Register")
    public OkInfo register(HttpServletRequest request) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        User user = userDaoBiz.get(username);
        if (user != null) {
            return new OkInfo(2, "该账号已经存在!");
        } else {
            User user1 = new User();
            user1.setUsername(username);
            user1.setPassword(password);
            userDaoBiz.add(user1);
            return new OkInfo(1, "注册成功!");
        }
    }

    @ResponseBody
    @RequestMapping("/login")
    public UserrLoginInfo login(HttpServletRequest request) {
        String account = request.getParameter("account");
        String password = request.getParameter("password");
        User user = userDaoBiz.get(account);
        if (user != null && user.getPassword().equals(password)) {
            return new UserrLoginInfo(1, "登录成功!", user);
        } else {
            return new UserrLoginInfo(0, "登录失败!", null);
        }
    }

    @ResponseBody
    @RequestMapping("/queryAllPeople")
    public List<User> queryAllPeople() {
        List<User> list = new ArrayList<>();
        list = userDaoBiz.getAll();
        return list;

    }
}
