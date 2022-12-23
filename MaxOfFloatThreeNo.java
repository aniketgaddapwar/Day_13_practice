package com.Day_13;

public class MaxOfFloatThreeNo {
    public static String maximum(Float num1, Float num2,Float num3){
        String number1 = Float.toString(num1);
        String number2 = Float.toString(num2);
        String number3 = Float.toString(num3);
        String max = number1;
        if(number2.compareTo(max)>0){
            max = number2;
        }
        if(number3.compareTo(max)>0){
            max = number3;
        }
        return max;
    }
    public static void main(String[] args) {
        Float num1=6.2f, num2=7.4f, num3=4.5f;
        System.out.println(maximum(num1,num2,num3));
    }
}
