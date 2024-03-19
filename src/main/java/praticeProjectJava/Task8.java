package praticeProjectJava;

import java.util.Scanner;

public class Task8 {

    public static void main(String[] args) {

        //Maximum and minimum number in the array?

        int [] array=new int[5];
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter 5 numbers: ");
        int number= scanner.nextInt();
        for(int i=0;i< array.length;i++)
        {
            array[i]= scanner.nextInt();
        }
        int max=0;
        int min=0;
        for(int i=1;i< array.length;i++)
        {
            if(array[i]>max)
            {
                max=array[i];
            }
        }
        for(int i=1;i< array.length;i++)
        {
            if(array[i]<min)
            {
                min=array[i];
            }
        }
        System.out.println("Max value: " + max);
        System.out.println("Min value: "+ min);
    }


            }