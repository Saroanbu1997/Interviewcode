package Interviewquestion;

import java.util.ArrayList;

public class Extractnumber {

	public static void main(String[] args) {

		String value="Saravanan233";
		int d=0;
		ArrayList<Integer> num= new ArrayList<Integer>();
		for(int i=0;i<value.length()-1;i++) {
		if(Character.isDigit(value.charAt(i))) {
			int n=Character.getNumericValue(value.charAt(i));
			num.add(n);
			// d=d+n;
		}
	}
		int c= num.get(0)+num.get(1);
System.out.println(num);
System.out.println(c);
}
}