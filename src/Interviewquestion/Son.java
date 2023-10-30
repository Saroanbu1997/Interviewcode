package Interviewquestion;

public class Son extends Parent{

	
	 public void marraige() { System.out.println("My marraige my rules"); }
	 
	public static void main(String[] args) {

		Parent ref= new Son();
		ref.properties();
		ref.marraige();
		
		String string1 = "MYTEXT";
		String string6 = "MYT1EXT";
		if(string1 != "MYTEXT") {
			System.out.println("Output is true ");	
		}
				
	}

}
