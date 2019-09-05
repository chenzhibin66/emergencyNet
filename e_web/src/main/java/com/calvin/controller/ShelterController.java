package com.calvin.controller;

import com.calvin.biz.ShelterBiz;
import com.calvin.entity.Shelter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author Calvin
 * @Description:
 */
@Controller("shelterController")
@RequestMapping("/shelter")
public class ShelterController {

    @Autowired
    private ShelterBiz shelterBiz;


    @ResponseBody
    @RequestMapping("/queryShelter")
    public List<Shelter> queryShelter() {
        return shelterBiz.getAll();
    }

    @ResponseBody
    @RequestMapping("/addShelter")
    public int addShelter(Shelter shelter) {
        System.out.println(shelter);
        shelterBiz.add(shelter);
        return 1;
    }
}
