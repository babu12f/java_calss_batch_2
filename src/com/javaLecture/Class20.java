package com.javaLecture;

import java.sql.*;
import java.util.List;
import java.util.Scanner;

public class Class20 {
    public static void main(String[] args) {
        /*Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int rs = 0;

        try {
            rs = a/b;

            System.out.println(rs);

            //file.close()
        }
        catch (ArithmeticException aex) {
            System.out.println("math exception");
        }
        catch (Exception ex) {
            System.out.println("General exception");
        }
        finally {
            System.out.println("the finally block");
        }

        System.out.println("hi");*/

        /*Connection con = DBConnection.getConnection();

        //String sql = "select id, name, age, address from person_info";
        String sql = "select name as p_name, id as p_id, age as p_age, address as p_address from person_info";


        try {
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("p_id");
                String name = resultSet.getString("p_name");
                int age = resultSet.getInt("p_age");
                String address = resultSet.getString("p_address");

                System.out.println("Id: " + id + " name: " + name + " age: " + age + " Address: " + address);
            }

        }
        catch (SQLException e) {
            e.printStackTrace();
        }*/

        PersonInfoRepository personRepo = new PersonInfoRepository();

        /*List<PersonInfo> allPerson = personRepo.getAllPerson();

        for (PersonInfo p : allPerson) {
            System.out.println(p);
        }*/

        PersonInfo pinfo = personRepo.getPersonById(5);

        System.out.println(pinfo);
    }
}
