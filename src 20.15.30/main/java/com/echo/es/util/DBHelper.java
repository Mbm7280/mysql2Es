package com.echo.es.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBHelper {
    public static final String url = "jdbc:mysql://localhost:3306/lagou_position?useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai";
    public static final String name = "com.mysql.cj.jdbc.Driver";
    public static final String user = "root";
    public static final String password = "admin";
    private  static Connection  connection = null;

    public  static   Connection  getConn(){
        try {
            Class.forName(name);
            connection = DriverManager.getConnection(url,user,password);
        }catch (Exception e){
            e.printStackTrace();
        }
        return  connection;
    }
}
