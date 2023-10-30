package Interviewquestion;

import java.util.Scanner;

public class Dum {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		 

        System.out.println("Enter a number between 1 and 100:");

        int num = scanner.nextInt();

 

        if (num >= 1 && num <= 100) {

            if (num % 3 == 0 && num % 5 == 0) {

                System.out.println("FizzBuzz");

            } else if (num % 3 == 0) {

                System.out.println("Fizz");

            } else if (num % 5 == 0) {

                System.out.println("Buzz");

            } else {

                System.out.println(num);

            }

        } else {

            System.out.println("Number should be between 1 and 100");

        }

 

        scanner.close();

    
		
	}

}
