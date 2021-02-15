package com.sda.zaawansowane.wstepoop.homework.interfaces.zadanie1;

public class MainValidate {

    public static void main(String[] args) {

        UserValidator uv = new UserValidator();
        String[] mails = uv.validateEmails("email@page.com", "asd@page");
        System.out.println(mails[0] + " - " + mails[1]);
    }

}
