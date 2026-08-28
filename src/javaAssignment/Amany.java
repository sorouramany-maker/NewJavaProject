package javaAssigment;
import java.util.Scanner;
public class Amany {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int choice;

        do {
            System.out.println("=========================");
            System.out.println("Number Analyzer Menu");
            System.out.println("=========================");
            System.out.println("1 - Print Numbers 10 to 1");
            System.out.println("2 - Print Even/Odd Report");
            System.out.println("3 - Check Number Type");
            System.out.println("4 - Calculate Sum Between Two Numbers");
            System.out.println("5 - Exit");
            System.out.println("=========================");

            System.out.println("Enter your choice:");
            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    printNumbersDescending();
                    break;

                case 2:
                    printEvenOrOdd();
                    break;

                case 3:
                    System.out.println("Enter a number:");
                    int number = scanner.nextInt();
                    System.out.println(checkNumberType(number));
                    break;

                case 4:
                    System.out.println("Enter first number:");
                    int number1 = scanner.nextInt();

                    System.out.println("Enter second number:");
                    int number2 = scanner.nextInt();

                    System.out.println("Sum = " + calculateSum(number1, number2));
                    break;

                case 5:
                    System.out.println("Thank you for using Number Analyzer.");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);
    }
    //     Prints numbers from 1 to 10 and shows whether each number is even or odd
    public static void  printNumbersDescending()
    {
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }}
    //     Prints numbers from 1 to 10 and shows whether each number is even or odd

    public static void printEvenOrOdd() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " - Even");
            } else {
                System.out.println(i + " - Odd");
            }
        }
    }
    // Checks the entered number and returns whether it is positive, negative, or zero.
    // param number the number that will be checked
    // return "Positive", "Negative", or "Zero" based on the number
    public static String checkNumberType(int number) {
                if (number > 0) {
                    return "positive";
                } else if(number <0){
                    return "negative";
                } else{
                    return "zero";}}
   // Adds two numbers together and returns their total.
   // param firstnumber the first number to be added
   // param secondnumber the second number to be added
   // return the sum of the two numbers
   public static int  calculateSum(int firstnumber , int secondnumber){
       System.out.println("enter first number");
       System.out.println("enter second number");
       int sum = firstnumber + secondnumber;
           return sum;}}
