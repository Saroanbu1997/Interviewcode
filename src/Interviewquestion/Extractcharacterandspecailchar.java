package Interviewquestion;

import java.util.ArrayList;

public class Extractcharacterandspecailchar {

	public static void main(String[] args) {

		String value="Saravanan@#!!233ss";
		int d=0;
		String str="";
		ArrayList<Integer> num= new ArrayList<Integer>();
		for(int i=0;i<value.length();i++) {
		if(!(Character.isLetter(value.charAt(i))||Character.isWhitespace(value.charAt(i))||Character.isDigit(value.charAt(i)))) {
			str=str+value.charAt(i);
		}
	}
		
System.out.println(str);
}
}