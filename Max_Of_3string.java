package com.Day_13;

public class Max_Of_3string {
    public static String maximum(String str1, String str2, String str3) {
        String max = str1;
        if (str2.compareTo(max) > 0) {
            max = str2;
        }
        if (str3.compareTo(max) > 0) {
            max = str3;
        }
        return max;
    }

    public static void main(String[] args) {
        String str1 = "Apple", str2 = "Peach", str3 = "Banana";
        System.out.println(maximum(str1, str2, str3));
    }
}