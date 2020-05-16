package com.qm.ssm.service.impl;

import com.qm.ssm.mapper.SelectMapper;
import com.qm.ssm.pojo.DoubleColorBall;
import com.qm.ssm.service.SelectService;
import com.qm.ssm.utils.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SelectServiceImpl implements SelectService {

    @Autowired
    private SelectMapper selectMapper;

    @Override
    public List<String> selectOpenDate() {
       List<String> openDate = selectMapper.selectOpenDate();
       return openDate;
    }

    @Override
    public R selectOnce(String openingDate) {
        DoubleColorBall ball = selectMapper.selectOnce(openingDate);
        R r = new R();
        List seriesData = new ArrayList();
        seriesData.add(ball.getRedOne());
        seriesData.add(ball.getRedTwo());
        seriesData.add(ball.getRedThree());
        seriesData.add(ball.getRedFour());
        seriesData.add(ball.getRedFive());
        seriesData.add(ball.getRedSix());
        seriesData.add(ball.getBlueOne());
        return R.ok().put("seriesData", seriesData);


    }
}
