package com.javaLecture;

import java.sql.*;

public class Class18 {

    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost/java_batch_2?serverTimezone=UTC";
        String USER_NAME = "root";
        String PASSWORD = "";

        try {
            Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);

            //String sql = "select id, name, age, address from person_info";
            String sql = "select name as p_name, id as p_id, age as p_age, address as p_address from person_info";

            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            /*while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String name = resultSet.getString(2);
                int age = resultSet.getInt(3);
                String address = resultSet.getString(4);

                System.out.println("Id: " + id + " name: " + name + " age: " + age + " Address: " + address);
            }*/

            /*while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String address = resultSet.getString("address");

                System.out.println("Id: " + id + " name: " + name + " age: " + age + " Address: " + address);
            }*/

            while (resultSet.next()) {
                int id = resultSet.getInt("p_id");
                String name = resultSet.getString("p_name");
                int age = resultSet.getInt("p_age");
                String address = resultSet.getString("p_address");

                System.out.println("Id: " + id + " name: " + name + " age: " + age + " Address: " + address);
            }

            con.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

    }
}


/*
 * 1. mysql - download mySql jar
 *
 * https://mvnrepository.com/artifact/mysql/mysql-connector-java/8.0.19
 *
 * adding jar to the project
 *
 * */