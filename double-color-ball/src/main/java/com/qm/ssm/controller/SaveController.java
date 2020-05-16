package com.qm.ssm.controller;

import com.qm.ssm.service.SaveService;
import com.qm.ssm.service.SelectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SaveController {

    @Autowired
    private SaveService saveService;

    @ResponseBody
    @RequestMapping("/save")
    public boolean save(){
        boolean save = saveService.save();
        return save;
    }

}
