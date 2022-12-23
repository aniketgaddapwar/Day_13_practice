package com.Day_13;

public class Max_using_Genrics {
    public static <E extends Comparable<E>> E maximum(E number1, E number2, E number3) {
        E max = number1;
        if (number2.compareTo(max) > 0) {
            max = number2;
        }
        if (number3.compareTo(max) > 0) {
            max = number3;
        }
        return max;

    }

    public static void main(String[] args) {
        Integer num1 = 10, num2 = 30, num3 = 5;
        Float value1 = 2.5f, value2 = 1.5f, value3 = 1.6f;
        String str1 = "Apple", str2 = "Banana", str3 = "Peach";
        System.out.println(maximum(num1, num2, num3));
        System.out.println(maximum(value1, value2, value3));
        System.out.println(maximum(str1, str2, str3));
    }
}
