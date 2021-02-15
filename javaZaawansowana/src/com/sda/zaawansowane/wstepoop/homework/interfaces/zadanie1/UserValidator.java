package com.sda.zaawansowane.wstepoop.homework.interfaces.zadanie1;

import java.util.regex.Pattern;

public class UserValidator {

    String[] validateEmails(String emailFirst, String emailSecond) {
        class Email {
            private String email;

            public Email(String email) {
                if (!validate(email)) {
                    this.email = "unknown";
                } else {
                    this.email = email;
                }
            }
        }

        Email mailMain = new Email(emailFirst);
        Email mailSecondary = new Email(emailSecond);

        return new String[]{mailMain.email,mailSecondary.email};
    }

    private boolean validate(String email) {
        String EMAIL_PATTERN = "^\\w+@\\w+\\.\\w+$";
        if (email == null || email.isEmpty()) {
            return false;
        } else {
            return (Pattern.compile(EMAIL_PATTERN).matcher(email).matches());
        }
    }
}
