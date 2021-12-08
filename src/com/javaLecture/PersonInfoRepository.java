package com.javaLecture;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class PersonInfoRepository {

    public List<PersonInfo> getAllPerson() {
        List<PersonInfo> personInfoList = new ArrayList<>();

        String sql = "select name as p_name, id as p_id, age as p_age, address as p_address from person_info";
        try(Connection con = DBConnection.getConnection()) {
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("p_id");
                String name = resultSet.getString("p_name");
                int age = resultSet.getInt("p_age");
                String address = resultSet.getString("p_address");

                PersonInfo personInfo = new PersonInfo(id, name, age, address);

                personInfoList.add(personInfo);
            }

        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return personInfoList;
    }

    public PersonInfo getPersonById(Integer id) {
        PersonInfo personInfo = null;

        String sql = "select name as p_name, id as p_id, age as p_age, address as p_address from person_info where id = " + id + "";
        try(Connection con = DBConnection.getConnection()) {
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);

            if (resultSet.next()) {
                int pid = resultSet.getInt("p_id");
                String name = resultSet.getString("p_name");
                int age = resultSet.getInt("p_age");
                String address = resultSet.getString("p_address");

                personInfo = new PersonInfo(pid, name, age, address);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }

        return personInfo;
    }

    public PersonInfo getPersonInfoByName(String name) {
        //Homework
        return null;
    }

    public void savePersonInfo(PersonInfo info) {
        //Homework
    }

    public void updatePersonInfo(PersonInfo info) {
        //Homework
    }

    public void deletePersonInfoById(Integer id) {
        //Homework
    }
}
