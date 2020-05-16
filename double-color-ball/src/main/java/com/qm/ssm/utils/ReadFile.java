package com.qm.ssm.utils;

import com.qm.ssm.utils.DbConnection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.sql.Connection;
import java.sql.SQLException;


public class ReadFile {

//    public static void main(String[] args) throws IOException, SQLException {
//        find();
//    }
//
//    public static void find() throws IOException, SQLException {
//        Connection conn = DbConnection.getConnection();
//
//
//        URL url = new URL("http://www.17500.cn/getData/ssq.TXT");
//        URLConnection connection = url.openConnection();
//
//        BufferedReader buffer = new BufferedReader(new InputStreamReader(connection.getInputStream()));
//
//        String line = null;
//
//        while ((line = buffer.readLine()) != null) {
////            String str = line;
//            String[] group = line.split(" ");
//            System.out.println(group[0]+"------"+group[1]+"------"+group[2]+"------"+group[3]+"------"+group[4]+"------"+group[5]+"------"+group[6]+"------"+group[7]+"------"+group[8]+"------"+group[9]+"------"+group[10]+"------"+group[11]+"------"+group[12]+"------"+group[13]+"------"+group[14]+"------"+group[15]+"------"+group[16]+"------"+group[17]+"------"+group[18]+"------"+group[19]+"------"+group[20]+"------"+group[21]+"------"+group[22]+"------"+group[23]+"------"+group[24]+"------"+group[25]+"------"+group[26]+"------"+group[27]+"------"+group[28]+"------");
//            System.out.println("=========================");
////            DbConnection.insert(group);
//        }
//    }


}
