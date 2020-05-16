package com.qm.ssm.mapper;

import com.qm.ssm.pojo.DoubleColorBall;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface SaveMapper {

    @Select("select * from doublecolorball where openingId = #{openingId}")
    DoubleColorBall selectByOpenId(Long openingId);

//    @Insert("insert into " +
//            "doublecolorball(id,openingId,openingDate,redOne,redTwo,redThree,redFour,redFive,redSix,blueOne,redOutOne,redOutTwo,redOutThree,redOutFour,redOutFive,redOutSix,totalBets,prizePoolAmount,firstOrderNoteNumber,firstPrize,secondOrderNoteNumber,secondPrize,thirdOrderNoteNumber,thirdPrize,forthOrderNoteNumber,forthPrize,fifthOrderNoteNumber,fifthPrize,sixthOrderNoteNumber,sixthPrize) " +
//            "values (null,#{openingId},#{openingDate},#{redOne},#{redTwo},#{redThree},#{redFour},#{redFive},#{redSix},#{blueOne},#{redOutOne},#{redOutTwo},#{redOutThree},#{redOutFour},#{redOutFive},#{redOutSix},#{totalBets},#{prizePoolAmount},#{firstOrderNoteNumber},#{firstPrize},#{secondOrderNoteNumber},#{secondPrize},#{thirdOrderNoteNumber},#{thirdPrize},#{forthOrderNoteNumber},#{forthPrize},#{fifthOrderNoteNumber},#{fifthPrize},#{sixthOrderNoteNumber},#{sixthPrize})")
//    int add(@Param("openingId")Long openingId,@Param("openingDate")String openingDate,@Param("redOne")Integer redOne,@Param("redTwo")Integer redTwo, @Param("redThree")Integer redThree,@Param("redFour")Integer redFour,@Param("redFive")Integer redFive,@Param("redSix")Integer redSix,@Param("blueOne")Integer blueOne,@Param("redOutOne")Integer redOutOne,@Param("redOutTwo")Integer redOutTwo,@Param("redOutThree")Integer redOutThree,@Param("redOutFour")Integer redOutFour,@Param("redOutFive")Integer redOutFive,@Param("redOutSix")Integer redOutSix,@Param("totalBets")Long totalBets,@Param("prizePoolAmount")Long prizePoolAmount,@Param("firstOrderNoteNumber")Integer firstOrderNoteNumber,@Param("sixthOrderNoteNumber")Long firstPrize,@Param("secondOrderNoteNumber")Integer secondOrderNoteNumber,@Param("secondPrize")Long secondPrize,@Param("thirdOrderNoteNumber")Integer thirdOrderNoteNumber,@Param("thirdPrize")Long thirdPrize,@Param("forthOrderNoteNumber")Integer forthOrderNoteNumber,@Param("forthPrize")Long forthPrize,@Param("fifthOrderNoteNumber")Integer fifthOrderNoteNumber,@Param("fifthPrize") Long fifthPrize,@Param("sixthOrderNoteNumber")Integer sixthOrderNoteNumber,@Param("sixthPrize")Long sixthPrize);

    @Insert("insert into " +
            "doublecolorball(id,openingId,openingDate,redOne,redTwo,redThree,redFour,redFive,redSix,blueOne,redOutOne,redOutTwo,redOutThree,redOutFour,redOutFive,redOutSix,totalBets,prizePoolAmount,firstOrderNoteNumber,firstPrize,secondOrderNoteNumber,secondPrize,thirdOrderNoteNumber,thirdPrize,forthOrderNoteNumber,forthPrize,fifthOrderNoteNumber,fifthPrize,sixthOrderNoteNumber,sixthPrize) " +
            "values (null,#{openingId},#{openingDate},#{redOne},#{redTwo},#{redThree},#{redFour},#{redFive},#{redSix},#{blueOne},#{redOutOne},#{redOutTwo},#{redOutThree},#{redOutFour},#{redOutFive},#{redOutSix},#{totalBets},#{prizePoolAmount},#{firstOrderNoteNumber},#{firstPrize},#{secondOrderNoteNumber},#{secondPrize},#{thirdOrderNoteNumber},#{thirdPrize},#{forthOrderNoteNumber},#{forthPrize},#{fifthOrderNoteNumber},#{fifthPrize},#{sixthOrderNoteNumber},#{sixthPrize})")
    int addAll(DoubleColorBall ball);
}
