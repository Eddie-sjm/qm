package com.qm.ssm.service;

import com.qm.ssm.pojo.DoubleColorBall;
import com.qm.ssm.utils.R;

import java.util.List;

public interface SelectService {
    List<String> selectOpenDate();

    R selectOnce(String openingDate);
}
