package com.example.smsverification;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class codeExtract {
    private static Pattern pattern = Pattern.compile("^<#> Your EzyAgric code: ([0-9]+).");

    public static void getMessageString(String[] args) {
        System.out.println(
                getOTPCode("<#> Your EzyAgric code: 5678. Valid for 5 minutes.Don't share this code with others 4sgLq1p5sV6"));
    }

    public static String getOTPCode(String message) {
        String code = null;
        Matcher matcher = pattern.matcher(message);

        while (matcher.find()) {
            code = matcher.group(1);
        }

        return code;
    }
}