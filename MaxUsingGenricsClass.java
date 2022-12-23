package com.Day_13;

public class MaxUsingGenricsClass {
    public class MaxUsingGenericsClass<E extends Comparable<E>> {
        E x, y, z;

        public MaxUsingGenericsClass(E x, E y, E z) {
            this.x = x;
            this.y = y;
            this.z = z;
        }

        public E maximum() {
            return MaxUsingGenericsClass.maximum(x, y, z);
        }

        public static <E extends Comparable<E>> E maximum(E x, E y, E z) {
            E max = x;
            if (y.compareTo(max) > 0) {
                max = y;
            }
            if (z.compareTo(max) > 0) {
                max = z;
            }
            return max;

        }

        public static void main(String[] args) {
            Integer num1 = 10, num2 = 30, num3 = 5;
            Float value1 = 2.5f, value2 = 1.5f, value3 = 1.6f;
            String str1 = "Peach", str2 = "Apple", str3 = "Banana";
            System.out.println(maximum(num1, num2, num3));
            System.out.println(maximum(value1, value2, value3));
            System.out.println(maximum(str1, str2, str3));

        }
    }
}
