package praticeProjectJava;

public class Task3 {
    public static void main(String[] args) {

        /*Create a 2D array or integer type where you will store odd and even numbers.
         Develop a program which will identify/print the even numbers only.*/

        int [][] oddEvenNumbers={
                {1,5,6,8,9},
                {11,14,20,25,27}
        };
        System.out.println("Even numbers in this 2D array are: ");
        for(int i=0; i<2;i++)
        {
            for(int j=0; j<5;j++)
            {
                if(oddEvenNumbers[i][j] %2 ==0)
                {
                    System.out.print(oddEvenNumbers[i][j]+ " ");
                }
            }
        }






    }
}
