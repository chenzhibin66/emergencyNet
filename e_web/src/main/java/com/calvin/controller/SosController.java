package com.calvin.controller;

import com.calvin.biz.SosBiz;
import com.calvin.biz.UserDaoBiz;
import com.calvin.dao.UserDao;
import com.calvin.entity.User;
import com.calvin.entity.Sos;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
@Controller("sosController")
@RequestMapping("/sos")
public class SosController {

    @Autowired
    private SosBiz sosBiz;
    @Autowired
    private UserDaoBiz userDaoBiz;


    @ResponseBody
    @RequestMapping("/sendSos")
    public void sendSos(HttpServletRequest request) {
        String username = request.getParameter("username");
        int msg = Integer.parseInt(request.getParameter("message"));
        double longitude = Double.parseDouble(request.getParameter("longitude"));
        double latitude = Double.parseDouble(request.getParameter("latitude"));
        User poster = userDaoBiz.get(username);
        Sos sos = new Sos();
        sos.setPoster(poster);
        sos.setLongitude(longitude);
        sos.setLatitude(latitude);
        sos.setMessage(msg);
        sos.setPostTime(new Date());
        sosBiz.sos(sos);
    }

    @ResponseBody
    @RequestMapping("/queryAllSos")
    public List<Sos> queryAllSos() {
        List<Sos> list = new ArrayList<>();
        list = sosBiz.getAll();
        return list;
    }

    @ResponseBody
    @RequestMapping("/querySos")
    public Sos querySos(HttpServletRequest request) {
        String username = request.getParameter("username");
        User poster = new User();
        poster = userDaoBiz.get(username);
        Sos sos = new Sos();
        if (poster != null) {
            sos = sosBiz.get(username);
            sos.setPoster(poster);
        }
        return sos;
    }

}
