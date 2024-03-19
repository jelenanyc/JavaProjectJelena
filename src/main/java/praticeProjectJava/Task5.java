package praticeProjectJava;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {

        //Write a program to swap 2 numbers without a temporary variable?

        Scanner input=new Scanner(System.in);
        System.out.println("Please enter two numbers!");
        System.out.println("First number is : ");
        int number1= input.nextInt();
        System.out.println("Second number is : ");
        int number2= input.nextInt();
        number1=number1+number2;
        number2=number1-number2;
        number1=number1-number2;
        System.out.println("Value of the first number after swaping is "+ number1);
        System.out.println("Value of the second number after swaping is " + number2);



    }
}
