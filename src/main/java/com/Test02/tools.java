package com.Test02;


public class tools {
    // 字符串去无效字符(空格，制表符，换行，标点等)后的长度.
    public static int replaceBlank(String str) {
        String dest = "";
        if (str != null) {
            str = str.replaceAll("[\\pP‘’“”]", "");
            dest = str.replaceAll("\\s*|\t|\r|\n", "");
        }
        return dest.length();
    }
}


