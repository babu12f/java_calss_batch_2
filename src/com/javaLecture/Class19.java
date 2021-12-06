package com.javaLecture;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Class19 {
    public static void main(String[] args) {
        String URL = "jdbc:mysql://localhost/java_batch_2?serverTimezone=UTC";
        String USER_NAME = "root";
        String PASSWORD = "";

        /*try {
            Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            Statement statement = con.createStatement();

            Scanner sc = new Scanner(System.in);

            System.out.println("Input Person Name: ");
            String name = sc.nextLine();
            System.out.println("Input Person Age: ");
            int age = sc.nextInt();
            System.out.println("Input Person Address: ");
            sc.nextLine();
            String address = sc.nextLine();

            System.out.println(address);

            String sqlInsert = "insert into person_info (name, age, address) values ('"+ name +"', "+ age + ", '"+ address +"')";
            statement.executeUpdate(sqlInsert);

            con.close();
        }
        catch (SQLException e) {
            e.printStackTrace();
        }*/


        /*try {
            Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            Statement statement = con.createStatement();

            Scanner sc = new Scanner(System.in);

            System.out.println("Input Person Name: ");
            String name = sc.nextLine();
            System.out.println("Input Person Age: ");
            int age = sc.nextInt();
            System.out.println("Input Person Address: ");
            sc.nextLine();
            String address = sc.nextLine();

            String sqlInsert = "update person_info set name = '" + name + "', age =  " + age + ", address = '" + address + "' where id = 1";
            statement.executeUpdate(sqlInsert);

            con.close();

        }
        catch (SQLException e) {
            e.printStackTrace();
        }*/

        /*
        * C - Create = insert
        * R - Read = select
        * U - Update = update
        * D - Delete = delete
        *
        * CRUD
        *
        * */
        try {

            Connection con = DriverManager.getConnection(URL, USER_NAME, PASSWORD);
            Statement statement = con.createStatement();

            Scanner sc = new Scanner(System.in);

            System.out.println("enter id to delete info: ");
            int id = sc.nextInt();

            String sqlInsert = "delete from person_info where id = " + id;
            statement.executeUpdate(sqlInsert);

            con.close();
        }
        catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
}
