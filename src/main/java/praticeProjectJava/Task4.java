package praticeProjectJava;

public class Task4 {
    public static void main(String[] args) {

        /*Create a 2D array of integers.
        Develop a program which will calculate the sum of  even and odd numbers for that array.
         */

        int [][] numbers={
                {10,15,20,25,30,35,40},
                {45,50,55,60,65,70,75}
        };
        int sum1=0;
        int sum2=0;
        for (int i=0;i<2;i++)
        {
            for (int j=0;j<7;j++)
            {
                if(numbers[i][j] %2==0)
                {
                    sum1=sum1+numbers[i][j];


                }
                if(numbers[i][j]%2!=0)
                {
                    sum2=sum2+numbers[i][j];
                }
            }

        }
        System.out.println("The summary of Even numbers in the array is: "+sum1);
        System.out.println("The summary of Odd numbers in the array is :" + sum2);

    }
}


