package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

                        /** TASK 1*/
        /*
        // Task1
        Scanner scanner = new Scanner(System.in);

        //Read number 1
        System.out.println("Input the first number: ");
        int number1 = scanner.nextInt();

        //Read number 2
        System.out.println("Input second number: ");
        int number2 = scanner.nextInt();

        //Read number 3
        System.out.println("Input third number: ");
        int number3 = scanner.nextInt();

        int smallest;

        if (number1 < number2){
            smallest = number1;
        }else{
            smallest = number2;
        }
        if (number3 < smallest){
            smallest = number3;
        }
        System.out.println("The smallest number is: " + smallest);
        */

                         /** TASK 2*/
        /*
        //Task2
        Scanner scanner = new Scanner(System.in);

        System.out.println("Percentage obtained by a student: ");
        int percentage = scanner.nextInt();

        char gradeA = 'A';
        char gradeB = 'B';
        char gradeC = 'C';
        char gradeD = 'D';

        if (percentage >= 90) {
            System.out.println("Grade is: " + gradeA);
        } else if (percentage >= 75 && 90 > percentage) {
            System.out.println("Grade is: " + gradeB);
        } else if (percentage >= 65 && 75 > percentage) {
            System.out.println("Grade is: " + gradeC);
        } else {
            System.out.println("Grade is: " + gradeD);
        }
    }
    */

        /*
        //Task2 David
        Scanner scanner = new Scanner(System.in);

        System.out.println("Percentage obtained by a student: ");
        int percentage = scanner.nextInt();

        char grade;

        if (percentage > 90) {
            grade = 'A';
        } else if (percentage > 75) {
            grade = 'B';
        } else if (percentage > 65) {
            grade = 'C';
        } else {
            grade = 'D';
        }

        //Print grade
        System.out.println("The students grade is: " + grade);
    }
    */

                        /** TASK 3*/

        /**
         Pseudo Code for task 3:

         Read temperature

         If temperature >= 80 && temperature <= 95
            activity = swimming
         Else if temperature >= 60 (&& temperature < 80) - optional to write text in brackets because program goes argument after argument
            activity = tennis
         Else if temperature >= 40 (&& temperature < 60)
            activity = golf
         Else if temperature > 95 || temperature < 20
            activity = visit our shops
         Else if temperature < 40 && temperature >= 20
            activity = skiing
         Else
            return

         Print activity

         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input temperature: ");
        int temperature = scanner.nextInt();

        String activity;

        if (temperature >= 80 && temperature <= 95){
            activity = "Swimming";
        } else if (60 <= temperature && temperature < 80){
            activity = "Tennis";
        } else if (40 <= temperature && temperature < 60){
            activity = "Golf";
        } else if (temperature > 95 || temperature < 20){
            activity = "Visit our shops!";
        } else if (temperature < 40 && temperature >= 20){
            activity = "Skiing";
        } else {
            return;
        }

        //Print activity
        System.out.println("Appropriate activity for this temperature: " + activity);
    }



}