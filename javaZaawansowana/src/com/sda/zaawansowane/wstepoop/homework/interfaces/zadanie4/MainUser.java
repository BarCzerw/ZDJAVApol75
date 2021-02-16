package com.sda.zaawansowane.wstepoop.homework.interfaces.zadanie4;

public class MainUser {

    public static void main(String[] args) {

        User me = new User();

        me.setLogin("bartek202", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input.length() == 10;
            }
        });

        me.setPassword("p4ssw0rd", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                return input.contains("!");
            }
        });

        me.setName("bartek", new Validator<String>() {
            @Override
            public boolean validate(String input) {
                if (input==null || input.isEmpty()){
                    return false;
                }else {
                    return input.substring(0,1).toUpperCase().equals(input.substring(0,1));
                }
            }
        });

        me.setAge(158, new Validator<Integer>() {
            @Override
            public boolean validate(Integer input) {
                return input.compareTo(0)>=1 && input.compareTo(150)<=0;
            }
        });

        System.out.println(me);

    }

}
