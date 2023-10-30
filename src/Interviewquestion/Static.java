package Interviewquestion;

public class Static {
	
	static String str="saravnan";
	public void method() {
		System.out.println("Non static");
		method1();
		
	}
	public static void method1() {
		System.out.println("static");
		//method();
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
