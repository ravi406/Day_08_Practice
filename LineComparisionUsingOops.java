package com.bdglabz.day8;

import java.util.Scanner;

public class LineComparisionUsingOops {
    public static int x1, x2, y1, y2, x3, x4, y3, y4;
    static Double length1, length2;

    public void lengthValue() {
        Scanner sc = new Scanner(System.in);

        System.out.println("For given line");
        System.out.println("Enter co-ordinates of x1 and y1");
        x1 = sc.nextInt();
        y1 = sc.nextInt();

        System.out.println("Enter co-ordinates of x2 and y2");
        x2 = sc.nextInt();
        y2 = sc.nextInt();

        System.out.println("For second line");
        System.out.println("Enter co-ordinates of x3 and y3");
        x3 = sc.nextInt();
        y3 = sc.nextInt();

        System.out.println("Enter co-ordinates of x4 and y4");
        x4 = sc.nextInt();
        y4 = sc.nextInt();
    }


    public void lengthCalculation() {
        length1 = Math.sqrt((x2 - x1) ^ 2 + (y2 - y1) ^ 2);
        System.out.println("Length of first line = " + length1 + " units");
        length2 = Math.sqrt((x4 - x3) ^ 2 + (y4 - y3) ^ 2);
        System.out.println("Length of second line = " + length2 + " units");
    }

    public void ifEquals() {
        if (length1 == length2) {
            System.out.println("Lines are equal");
        } else {
            System.out.println("Lines are not equal");
        }
    }

    public void checkRelation() {
        if (length1 == length2) {
            System.out.println("Lines are equal");
        } else if (length1 > length2) {
            System.out.println("line 1 is greater than line 2");
        } else {
            System.out.println("Line 1 is less than line 2");
        }
    }

    public static void main(String[] args) {
        LineComparisionUsingOops input = new LineComparisionUsingOops();
        input.lengthValue();
        input.lengthCalculation();
        input.ifEquals();
        input.checkRelation();
    }
}
