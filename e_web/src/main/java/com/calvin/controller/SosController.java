package com.calvin.controller;

import com.calvin.biz.SosBiz;
import com.calvin.dto.OkInfo;
import com.calvin.entity.Sos;
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
@Controller("sosController")
@RequestMapping("/sos")
public class SosController {

    @Autowired
    private SosBiz sosBiz;


    @ResponseBody
    @RequestMapping("/queryAllSos")
    public List<Sos> queryAllSos() {
        List<Sos> list = new ArrayList<>();
        list = sosBiz.getAll();
        for (int i = 0; i <list.size() ; i++) {
            System.out.println(list.get(i));
        }
        return list;
    }

    @ResponseBody
    @RequestMapping("/querySos")
    public List<Sos> querySosByUid(HttpServletRequest request) {
        int id = Integer.parseInt(request.getParameter("id"));
        List<Sos> list = new ArrayList<>();
        list = sosBiz.get(id);
        return list;
    }

    @ResponseBody
    @RequestMapping("/sendSos")
    public OkInfo sendSos(HttpServletRequest request) {
        Sos sos = new Sos();
        int oldCount = sosBiz.countSos();
        double longitude = Double.parseDouble(request.getParameter("longitude"));
        double latitude = Double.parseDouble(request.getParameter("latitude"));
        int message = Integer.parseInt(request.getParameter("message"));
        sos.setLongitude(longitude);
        sos.setLatitude(latitude);
        sos.setMessage(message);
        sosBiz.sos(sos);
        int newCount = sosBiz.countSos();
        if (newCount == oldCount + 1) {
            return new OkInfo(1);
        } else {
            return new OkInfo(0);
        }
    }
}
