package praticeProjectJava;

public class Task2 {
    public static void main(String[] args) {


        /*Create an array of integer values. After the array is created,
        calculate the sum of all stored elements in that array
        */


            int [] values={1,2,3};

            int sum=0;
            for(int i=0; i< values.length; i++ )
            {
                if(sum<values[i])
                {
                    sum=sum+values[i];
                }
            }
            System.out.println("The summary of all stored elements in array is " + sum);
        }

    }

