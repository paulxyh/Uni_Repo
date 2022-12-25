package com.kowatschpaul.ue9;

public class StringUtils {
    public static boolean isEmpty(String str){
        return str == null || str.equals("");
    }
    public static boolean isNotEmpty(String str){
        return !isEmpty(str);
    }
    public static boolean isBlank(String str){
        if(str == null || str.equals("")){
            return true;
        } else return str.matches("\\s*");
    }
    public static boolean isNotBlank(String str){
        return !isBlank(str);
    }
}
