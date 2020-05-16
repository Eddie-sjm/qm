package com.qm.ssm.mapper;

import com.qm.ssm.pojo.DoubleColorBall;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface SelectMapper {

    @Select("select openingDate from doublecolorball")
    List<String> selectOpenDate();

    @Select("select * from doublecolorball where openingDate = #{openingDate} ")
    DoubleColorBall selectOnce(@Param("openingDate") String openingDate);
}
