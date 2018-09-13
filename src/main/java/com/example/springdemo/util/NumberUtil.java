package com.example.springdemo.util;

public class NumberUtil {

    public static String formatStr(String num) {
        return formatInt(Integer.parseInt(num));
    }

    public static String formatInt(int num) {
        return String.format("%06d", num);
    }
}
