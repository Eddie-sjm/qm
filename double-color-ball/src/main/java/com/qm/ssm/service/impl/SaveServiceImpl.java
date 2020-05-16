package com.qm.ssm.service.impl;

import com.qm.ssm.mapper.SaveMapper;
import com.qm.ssm.pojo.DoubleColorBall;
import com.qm.ssm.service.SaveService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

@Service
public class SaveServiceImpl implements SaveService {

    static Logger logger = LoggerFactory.getLogger(SaveServiceImpl.class);

    @Autowired
    SaveMapper saveMapper;

    @Override
    public boolean save() {
        URL url = null;
        URLConnection connection = null;
        BufferedReader buf = null;
        String line = null;
        boolean result = false;
        long count = 0;
        long flush = 0;
        try {
            url = new URL("http://www.17500.cn/getData/ssq.TXT");
            connection = url.openConnection();

            buf = new BufferedReader(new InputStreamReader(connection.getInputStream()));

            DoubleColorBall ball = new DoubleColorBall();
            while ((line = buf.readLine()) != null){
                count++;
                String[] group = line.split(" ");
                logger.info(group[0]+"------"+group[1]+"------"+group[2]+"------"+group[3]+"------"+group[4]+"------"+group[5]+"------"+group[6]+"------"+group[7]+"------"+group[8]+"------"+group[9]+"------"+group[10]+"------"+group[11]+"------"+group[12]+"------"+group[13]+"------"+group[14]+"------"+group[15]+"------"+group[16]+"------"+group[17]+"------"+group[18]+"------"+group[19]+"------"+group[20]+"------"+group[21]+"------"+group[22]+"------"+group[23]+"------"+group[24]+"------"+group[25]+"------"+group[26]+"------"+group[27]+"------"+group[28]);
                DoubleColorBall doubleColorBall= saveMapper.selectByOpenId(Long.valueOf(group[0]));
//                Long openingId = Long.valueOf(group[0]);
//                String openingDate = group[1];
//                Integer redOne = Integer.valueOf(group[2]);
//                Integer redTwo = Integer.valueOf(group[3]);
//                Integer redThree = Integer.valueOf(group[4]);
//                Integer redFour = Integer.valueOf(group[5]);
//                Integer redFive = Integer.valueOf(group[6]);
//                Integer redSix = Integer.valueOf(group[7]);
//                Integer blueOne = Integer.valueOf(group[8]);
//                Integer redOutOne = Integer.valueOf(group[9]);
//                Integer redOutTwo = Integer.valueOf(group[10]);
//                Integer redOutThree = Integer.valueOf(group[11]);
//                Integer redOutFour = Integer.valueOf(group[12]);
//                Integer redOutFive = Integer.valueOf(group[13]);
//                Integer redOutSix = Integer.valueOf(group[14]);
//                Long totalBets = Long.valueOf(group[15]);
//                Long prizePoolAmount = Long.valueOf(group[16]);
//                Integer firstOrderNoteNumber = Integer.valueOf(group[17]);
//                Long firstPrize = Long.valueOf(group[18]);
//                Integer secondOrderNoteNumber = Integer.valueOf(group[19]);
//                Long secondPrize = Long.valueOf(group[20]);
//                Integer thirdOrderNoteNumber = Integer.valueOf(group[21]);
//                Long thirdPrize = Long.valueOf(group[22]);
//                Integer forthOrderNoteNumber = Integer.valueOf(group[23]);
//                Long forthPrize = Long.valueOf(group[24]);
//                Integer fifthOrderNoteNumber = Integer.valueOf(group[25]);
//                Long fifthPrize = Long.valueOf(group[26]);
//                Integer sixthOrderNoteNumber = Integer.valueOf(group[27]);
//                Long sixthPrize = Long.valueOf(group[28]);

                ball.setOpeningId(Long.valueOf(group[0]));
                ball.setOpeningDate(group[1]);
                ball.setRedOne(Integer.valueOf(group[2]));
                ball.setRedTwo(Integer.valueOf(group[3]));
                ball.setRedThree(Integer.valueOf(group[4]));
                ball.setRedFour(Integer.valueOf(group[5]));
                ball.setRedFive(Integer.valueOf(group[6]));
                ball.setRedSix(Integer.valueOf(group[7]));
                ball.setBlueOne(Integer.valueOf(group[8]));
                ball.setRedOutOne(Integer.valueOf(group[9]));
                ball.setRedOutTwo(Integer.valueOf(group[10]));
                ball.setRedOutThree(Integer.valueOf(group[11]));
                ball.setRedOutFour(Integer.valueOf(group[12]));
                ball.setRedOutFive(Integer.valueOf(group[13]));
                ball.setRedOutSix(Integer.valueOf(group[14]));
                ball.setTotalBets(Long.valueOf(group[15]));
                ball.setPrizePoolAmount(Long.valueOf(group[16]));
                ball.setFirstOrderNoteNumber(Integer.valueOf(group[17]));
                ball.setFirstPrize(Long.valueOf(group[18]));
                ball.setSecondOrderNoteNumber(Integer.valueOf(group[19]));
                ball.setSecondPrize(Long.valueOf(group[20]));
                ball.setThirdOrderNoteNumber(Integer.valueOf(group[21]));
                ball.setThirdPrize (Long.valueOf(group[22]));
                ball.setForthOrderNoteNumber(Integer.valueOf(group[23]));
                ball.setForthPrize(Long.valueOf(group[24]));
                ball.setFifthOrderNoteNumber(Integer.valueOf(group[25]));
                ball.setFifthPrize(Long.valueOf(group[26]));
                ball.setSixthOrderNoteNumber(Integer.valueOf(group[27]));
                ball.setSixthPrize(Long.valueOf(group[28]));
                if (doubleColorBall == null){
                    flush++;
//                    int i = saveMapper.add(openingId,openingDate,redOne,redTwo,redThree,redFour,redFive,redSix,blueOne,redOutOne,redOutTwo,redOutThree,redOutFour,redOutFive,redOutSix,totalBets,prizePoolAmount,firstOrderNoteNumber,firstPrize,secondOrderNoteNumber,secondPrize, thirdOrderNoteNumber,thirdPrize,forthOrderNoteNumber,forthPrize,fifthOrderNoteNumber,fifthPrize,sixthOrderNoteNumber,sixthPrize);
                    int i = saveMapper.addAll(ball);
                }
            }
            System.out.println("总共"+count+"条数据");
            System.out.println("更新了"+flush+"条数据");
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

}
