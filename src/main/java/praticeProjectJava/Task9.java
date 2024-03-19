package praticeProjectJava;

import java.util.Arrays;

public class Task9 {
    public static void main(String[] args) {

        //Write a java program to find the second largest number in the array?



        int [] numbers = { 45, 20, 35, 15, 22, 5, 85};

        Arrays.sort(numbers);
        System.out.println("The second highest number is  " + numbers [numbers.length-2]);
    }
}




