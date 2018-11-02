package com.sanilk.hibernatetest2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class JDBCConnection {

    public static void main(String[] args){
        String jdbcUrl = "jdbc:postgresql://localhost:5432/hibernatetest";
        String user = "sanil";
        String password = "root";

        try{
            Connection connection = DriverManager.getConnection(jdbcUrl, user, password);
            Statement stmnt = connection.createStatement();
            stmnt.execute("CREATE TABLE MAIN();");
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
