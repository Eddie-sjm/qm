package com.qm.ssm.utils;

import com.mysql.jdbc.PreparedStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnection {
//    public static Connection getConnection(){
//        Connection conn = null;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            String url = "jdbc:mysql://localhost:3306/excel";
//            conn = DriverManager.getConnection(url, "root", "123456");
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        return conn;
//    }
//
//    public static int insert(String[] group){
//
//        Connection conn = getConnection();
//        int i = 0;
//
//        String sql = "insert into doublecolorball(id,openingId,openingDate,redOne,redTwo,redThree,redFour,redFive,redSix,blueOne,redOutOne,redOutTwo,redOutThree,redOutFour,redOutFive,redOutSix,totalBets,prizePoolAmount,firstOrderNoteNumber,firstPrize,secondOrderNoteNumber,secondPrize,thirdOrderNoteNumber,thirdPrize,forthOrderNoteNumber,forthPrize,fifthOrderNoteNumber,fifthPrize,sixthOrderNoteNumber,sixthPrize) values (null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
//        PreparedStatement pst;
//
//        try {
//            //表示预编译的sql对象
//            pst = (PreparedStatement) conn.prepareStatement(sql);
//
//            pst.setLong(1, Long.valueOf(group[0]));
//            pst.setString(2,group[1]);
//            pst.setInt(3,Integer.valueOf(group[2]));
//            pst.setInt(4,Integer.valueOf(group[3]));
//            pst.setInt(5,Integer.valueOf(group[4]));
//            pst.setInt(6,Integer.valueOf(group[5]));
//            pst.setInt(7,Integer.valueOf(group[6]));
//            pst.setInt(8,Integer.valueOf(group[7]));
//            pst.setInt(9,Integer.valueOf(group[8]));
//            pst.setInt(10,Integer.valueOf(group[9]));
//            pst.setInt(11,Integer.valueOf(group[10]));
//            pst.setInt(12,Integer.valueOf(group[11]));
//            pst.setInt(13,Integer.valueOf(group[12]));
//            pst.setInt(14,Integer.valueOf(group[13]));
//            pst.setInt(15,Integer.valueOf(group[14]));
//            pst.setLong(16,Long.valueOf(group[15]));
//            pst.setLong(17,Long.valueOf(group[16]));
//            pst.setInt(18,Integer.valueOf(group[17]));
//            pst.setLong(19,Long.valueOf(group[18]));
//            pst.setInt(20,Integer.valueOf(group[19]));
//            pst.setLong(21,Long.valueOf(group[20]));
//            pst.setInt(22,Integer.valueOf(group[21]));
//            pst.setLong(23,Long.valueOf(group[22]));
//            pst.setInt(24,Integer.valueOf(group[23]));
//            pst.setLong(25,Long.valueOf(group[24]));
//            pst.setInt(26,Integer.valueOf(group[25]));
//            pst.setLong(27,Long.valueOf(group[26]));
//            pst.setInt(28,Integer.valueOf(group[27]));
//            pst.setInt(29,Integer.valueOf(group[28]));
//            i = pst.executeUpdate();
//            pst.close();
//            conn.commit();
//            conn.close();
//            } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//        return i;
//    }

}
