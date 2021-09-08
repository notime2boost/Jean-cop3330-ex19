package Ex19;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Christopher Jean
 */
public class App 
{
    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        System.out.println("What is your weight?");
        double weight = input.nextDouble();
        System.out .println("What is your height in inches?");
        double height = input.nextDouble();
        double bmi = Math.round((weight / (height * height)) * 703);

        if(25> bmi && bmi> 18.5){
           System.out.println("Your BMI is "+ bmi +"\n"+"You are within the ideal weight range.");
        }
        if(bmi > 25){
            System.out.println("Your BMI is "+ bmi +"\n"+"You are overweight.");
        }
        if(bmi < 18.5){
            System.out.println("Your BMI is "+ bmi +"\n"+"You are underweight.");
        }
    }
}
