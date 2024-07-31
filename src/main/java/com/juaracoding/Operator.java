package com.juaracoding;

public class Operator {

    public static void  main(String[] ags) {

        int mouduls = 5%2;
        System.out.println(mouduls);

        int x = 2;
        x++;
        int num1 = 10 * x++; //suffix
        System.out.println(num1);

        int y = 2;
        int num2 = 10 * ++y; //prefix
        System.out.println(num2);

        int result = (10 + 2) * 6;
        System.out.println(result);

        //assigment operator
        int a = 10;
        a += 5; //a = a + 5
        System.out.println(a);

        // relational
        int b = 15;
        System.out.println(a == b); // 15 == 15
        System.out.println(a < b); // 15 < 15
        System.out.println(a <= b); // 15 <= 15 "kurang dari/sama dengan"

        // bitwise
        a = 10;
        b = 12;
        System.out.println(a & b); // 1000 (biner)

    }
}
