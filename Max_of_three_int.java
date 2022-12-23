package com.Day_13;

public class Max_of_three_int {
    public static String MaximumInteger(Integer num1, Integer num2, Integer num3) {
        String number1 = Integer.toString(num1);
        String number2 = Integer.toString(num2);
        String number3 = Integer.toString(num3);
        String max = number1;
        if (number2.compareTo(max) > 0) {
            max = number2;
        }
        if (number3.compareTo(max) > 0) {
            max = number3;
        }
        return max;
    }

    public static void main(String[] args) {
        int num1 = 10, num2 = 40, num3 = 30;
        System.out.println(MaximumInteger(num1, num2, num3));
    }
}
