package Interviewquestion;

public class StringPAlindrome {

	public static void main(String[] args) {
		String palrev="";
		String paln= "abba";
		for(int i=paln.length()-1;i>=0;i--) {
			palrev=palrev+paln.charAt(i);
			
		}
		if(paln.equalsIgnoreCase(palrev)) {
			System.out.println("its plandrome");
		}else {
			System.out.println("its not plandrome");
	
		}
	}

}
