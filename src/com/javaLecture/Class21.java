package com.javaLecture;

public class Class21 {

    public static void main(String[] args) {
        PersonInfoRepository personRepo = new PersonInfoRepository();


        /*PersonInfo pinfo = personRepo.getPersonInfoByName("khalid");

        System.out.println(pinfo);*/

        /*PersonInfo personInfo = new PersonInfo("roni", 30, "sylhet");

        personRepo.savePersonInfo(personInfo);*/

        //personRepo.deletePersonInfoById(9);

        PersonInfo personRuhit = personRepo.getPersonById(4);

        System.out.println("Before Update");
        System.out.println(personRuhit);

        personRuhit.setAge(19);
        personRuhit.setAddress("Rangpur");

        personRepo.updatePersonInfo(personRuhit);

        personRuhit = personRepo.getPersonById(4);
        System.out.println("After Update");
        System.out.println(personRuhit);

    }

}
