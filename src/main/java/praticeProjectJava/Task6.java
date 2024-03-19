package praticeProjectJava;

public class Task6 {
    public static void main(String[] args) {

        //Write a java program to check whether a given number is prime or not?

        int num =899;
        boolean value = false;
        for (int i=2; i<= num/2; i++){
            if (num %i==0){
                value=true;
                break;
            }
        }
        if(!value)
            System.out.println(num + " is a prime number. ");
        else
            System.out.println(num + " is not a prime number.");
    }
}





