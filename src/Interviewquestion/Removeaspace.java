package Interviewquestion;

public class Removeaspace {

	public static void main(String[] args) {
		String reverse="";
		String word= "I love india";
		String[] wsplit= word.split(" ");
		for(int i=0;i<wsplit.length;i++) {
			  reverse = reverse+wsplit[i];
			}
		
System.out.println(reverse);

	}

}
