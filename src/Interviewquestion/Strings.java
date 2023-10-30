package Interviewquestion;

public class Strings {

	public static void main(String[] args) {

		String name="saravanan";
		
		System.out.println(name.substring(1));
		System.out.println(name.substring(1,3));
		
		System.out.println(name.replace("r", "v"));
		System.out.println(name.replace("sara", "parr"));
		System.out.println(name);
		System.out.println(name.indexOf("a", 6));
		
		StringBuffer str= new StringBuffer("Saravanan");
		System.out.println(str.reverse());
	}

}
