package com.infogalaxy.linecomparisonprogram;

import java.util.Scanner;

public class LineComparisonProgram {
    //UC-2 Check Equality of Two Lines
    public static void equals(double lengthofline1 , double lengthofline2){
        if(lengthofline1 == lengthofline2) {
            System.out.println("Both Lines are Equal.");
        } else {
            //UC-3 Comparison of two lines
            if(lengthofline1 > lengthofline2) {
                System.out.println("1st Line is Greater. ");
            } else {
                System.out.println("2nd Line is Greater. ");
            }
        }
    }
    public static void main(String[] args) {
        //Welcome message for User
        System.out.println("Welcome to Line Comparison Computation Program Developed By Sejal Tamboli.");
        //UC-1 Calculate the length of line
        Scanner scanner = new Scanner(System.in);
        double x1;
        double x2;
        double y1;
        double y2;
        double a1;
        double a2;
        double b1;
        double b2;
        System.out.println("Enter the value of x1 : ");
        x1 = scanner.nextDouble();
        System.out.println("Enter the value of x2 : ");
        x2 = scanner.nextDouble();
        System.out.println("Enter the value of y1 : ");
        y1 = scanner.nextDouble();
        System.out.println("Enter the value of y2 : ");
        y2 = scanner.nextDouble();
        double lengthofline1  = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("Length of Line 1 : " + lengthofline1);

        System.out.println("Enter the value of a1 : ");
        a1 = scanner.nextDouble();
        System.out.println("Enter the value of a2 : ");
        a2 = scanner.nextDouble();
        System.out.println("Enter the value of b1 : ");
        b1 = scanner.nextDouble();
        System.out.println("Enter the value of b2 : ");
        b2 = scanner.nextDouble();
        double lengthofline2 = Math.sqrt(Math.pow((a2 - a1), 2) + Math.pow((b2 - b1), 2));
        System.out.println("Length of Line 2 : " + lengthofline2);
        equals(lengthofline1 , lengthofline2);
    }
}
