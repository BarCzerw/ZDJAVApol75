package com.sda.testowanie.emailchecker;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailChecker {

    public boolean isValidEmail(String s){

        Pattern pt = Pattern.compile("^\\w+@\\w+\\.\\w+$");
        Matcher mt = pt.matcher(s);

        return mt.find();
    }

}
