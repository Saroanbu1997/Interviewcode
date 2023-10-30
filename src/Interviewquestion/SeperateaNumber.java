package Interviewquestion;

import java.util.ArrayList;
import java.util.List;

public class SeperateaNumber {

	public static void main(String[] args) {

		String word= "saea932";
		int total=0;
		List<Integer> add = new ArrayList<Integer>();
		for(int i=0;i<word.length();i++) {
		char charcter=word.charAt(i);
		if(Character.isDigit(charcter)) {
			total=Character.getNumericValue(charcter);
			add.add(total);
			
		}
		}
		System.out.println(add);
		System.out.println(add.get(0)+add.get(1)+add.get(2));
		Integer d=3;
		String ad=d.toString();
		System.out.println(ad);
		Integer c=Integer.parseInt(ad);
		System.out.println(c);

		}

}
