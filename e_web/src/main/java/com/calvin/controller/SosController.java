package com.calvin.controller;

import com.calvin.biz.SosBiz;
import com.calvin.biz.UserDaoBiz;
import com.calvin.dto.OkInfo;
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
import java.util.Map;

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
    public OkInfo sendSos(HttpServletRequest request) {
        int uid = Integer.parseInt(request.getParameter("uid"));
        int msg = Integer.parseInt(request.getParameter("message"));
        double longitude = Double.parseDouble(request.getParameter("longitude"));
        double latitude = Double.parseDouble(request.getParameter("latitude"));
        int oldCount = userDaoBiz.querySosCount(uid);
        Sos sos = new Sos();
        sos.setUid(uid);
        sos.setLongitude(longitude);
        sos.setLatitude(latitude);
        sos.setMessage(msg);
        sos.setPostTime(new Date());
        sosBiz.sos(sos);
        int newCount = userDaoBiz.querySosCount(uid);
        if (newCount == oldCount + 1) {
            return new OkInfo(1, "求救信息发送成功!");
        } else {
            return new OkInfo(0, "求救信息发送失败!");
        }
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
    public List<Sos> querySosByUid(HttpServletRequest request) {
        int uid = Integer.parseInt(request.getParameter("uid"));
        List<Sos> list = new ArrayList<>();
        list = sosBiz.get(uid);
        return list;
    }


    @RequestMapping("/sos_list")
    public String sosList(Map<String,Object> map){
        map.put("list",sosBiz.getAll());
        return "sos_list";
    }

    @RequestMapping(value = "/remove", params = "sid")
    public String remove (int sid) {
        sosBiz;
        return "redirect:/sos/sos_list";
    }
}
