package com.calvin.controller;

import com.calvin.biz.SosBiz;
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


}
