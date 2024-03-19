package praticeProjectJava;

import java.util.Arrays;

public class Task10 {
    public static void main(String[] args) {

        //Write a program to print out duplicate elements from an Array of Strings?


        String [] array={"bmw","bmw","ford","ford","ferarri","yugo"};
        Arrays.sort(array);
        for(int i=0;i< array.length;i++)
        {

            for(int j=i+1;j< array.length;j++)
            {
                if (array[i].equals(array[j]))
                {

                    System.out.println(array[i]);
                }
            }

        }
    }
}
