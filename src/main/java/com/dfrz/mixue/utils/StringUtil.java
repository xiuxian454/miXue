package com.dfrz.mixue.utils;

public class StringUtil {

    public static boolean isNotEmpty(String str) {
        return str != null && !"".equals(str.trim());
    }

}
