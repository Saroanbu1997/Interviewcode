package Interviewquestion;

import java.util.ArrayList;
import java.util.List;

public class Letterchange {

	public static void main(String[] args) {

		String word="chrome";
		int ascivalue=0;
		String value = "";
		char conversationvalue ;
		
		for(int i=0;i<word.length();i++) {
			ascivalue=word.charAt(i);
			System.out.println(ascivalue);
				conversationvalue= (char) (ascivalue+1);
				
				value=value+Character.toString(conversationvalue);
				
				System.out.println(conversationvalue);

		}
		System.out.println();
		System.out.println(value);
	}

}
