import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner enterTheNumber = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int enteredNumberByUser = enterTheNumber.nextInt();


       if ((enteredNumberByUser % 3 == 0) && (enteredNumberByUser % 5 == 0))  {
            System.out.println("Divisible by 3 AND 5");
        }

       else if (enteredNumberByUser % 3 == 0) {
            System.out.println("Divisible by 3");
        }

       else if (enteredNumberByUser % 5 == 0) {
           System.out.println("Divisible by 5");
       }

        else {
            System.out.println("Not Divisible by 3 nor 5");
        }



        }





    }

