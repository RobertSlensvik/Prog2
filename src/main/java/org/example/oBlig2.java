package org.example;

public class oBlig2 {

    public static void main(String[] args) {
    }

    public static boolean isLeapYear(int year){

        if (year % 100 ==0 && year!=400) {
            System.out.println("The year is divided by 100 and not 400");
            return false;
        }
        else if (year % 400 == 0){
            System.out.println("The year is divided by 400");
            return true;
        }
        else if (year % 4 == 0 && year != 100){
            System.out.println("The year is divided by 4 and not 100");
            return true;
        }
        else if (year % 4 != 0){
            System.out.println("The year is not divided by 4");
            return false;
        }
        else if(year <= 0 && year!=100){
            System.out.println("NO, pick a year higher that 0");
            return false;
        }
        else
            return false;
    }
}