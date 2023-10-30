package Interviewquestion;

public class Reversealetter {

	public static void main(String[] args) {
		String reverse="";
		String word= "I love india";
		String[] wsplit= word.split(" ");
		for(int i=0;i<=wsplit.length-1;i++) {
		//	for(int i=wsplit.length-1;i>=0;i--) { //rever a word
			String car= wsplit[i];
			//String car= word;
			

			for(int j=car.length()-1;j>=0;j--){
				reverse=reverse+car.charAt(j);
				}
			reverse=reverse+" ";
		}
		System.out.println(reverse);

	}

}
