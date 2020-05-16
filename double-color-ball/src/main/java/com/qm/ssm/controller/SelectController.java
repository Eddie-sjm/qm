package com.qm.ssm.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.qm.ssm.pojo.DoubleColorBall;
import com.qm.ssm.service.SelectService;
import com.qm.ssm.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class SelectController {

    @Autowired
    private SelectService selectService;

//    @ResponseBody
//    @RequestMapping("/selectDate")
//    public String selectOpenDate(){
//        List<String> openDates = selectService.selectOpenDate();
//        String jsonString = JSONArray.toJSONString(openDates);
//        return jsonString;
//    }

    /**
     * 查询开奖日期
     * @param response
     * @throws IOException
     */
    @ResponseBody
    @RequestMapping("/selectDate")
    public void test(HttpServletResponse response) throws IOException {
        List<String> openDates = selectService.selectOpenDate();
        String jsonString = JSONArray.toJSONString(openDates);
        response.setContentType("text/html;charset=utf-8");
        response.getWriter().write(jsonString);
    }

    @ResponseBody
    @PostMapping("/selectOnePool")
    public R selectOnce(@RequestBody String openingDate){
        System.out.println(openingDate);
        return selectService.selectOnce(openingDate);
    }
}
