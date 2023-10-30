package Interviewquestion;

import java.util.Scanner;

public class StringComparison {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		 

        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

 

        for (int i = 0; i < words.length; i++) {
            if (i % 2 == 1) {
                result.append(Word(words[i]));
            } else {
                result.append(words[i]);
            }

 

            if (i != words.length - 1) {
                result.append(" ");
            }
        }

 

        System.out.println("Input: " + input);
        System.out.println("Output: " + result.toString());

 

        scanner.close();
    }

 

    public static String Word(String word) {
        return new StringBuilder(word).reverse().toString();
    }
}