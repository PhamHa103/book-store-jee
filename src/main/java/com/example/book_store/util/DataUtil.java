package com.example.book_store.util;

public class DataUtil {

    public static boolean isNull(Object obj) {
        return obj == null;
    }

    public static boolean isNullOrEmpty(String str) {
        return isNull(str) || str.trim().equals("");
    }

}
