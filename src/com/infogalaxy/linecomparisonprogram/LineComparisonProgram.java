package com.infogalaxy.linecomparisonprogram;

import java.util.Scanner;

public class LineComparisonProgram {
    public static void main(String[]args){
        //Welcome message for User
        System.out.println("Welcome to Line Comparison Computation Program Developed By Sejal Tamboli.");
        Scanner scanner = new Scanner(System.in);
        double x1 ;
        double x2 ;
        double y1 ;
        double y2 ;
        double length ;
        System.out.println("Enter the value of x1:");
        x1 = scanner.nextDouble();
        System.out.println("Enter the value of x2:");
        x2 = scanner.nextDouble();
        System.out.println("Enter the value of y1:");
        y1 = scanner.nextDouble();
        System.out.println("Enter the value of y2:");
        y2 = scanner.nextDouble();
        length = Math.sqrt(Math.pow((x2 - x1) , 2) + Math.pow((y2 - y1) , 2));
        System.out.println("Length =" + (length));
    }
}
