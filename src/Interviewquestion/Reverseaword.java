package Interviewquestion;

public class Reverseaword {

	public static void main(String[] args) {
		String reverse="";
		String word= "I love india";
		String[] wsplit= word.split(" ");
		for(int i=wsplit.length-1;i>=0;i--) {
			  reverse = reverse+wsplit[i]+ " ";
			}
		
System.out.println(reverse);
	}

}
