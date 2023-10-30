package Interviewquestion;

public class GetterSettermethod {
		//private data member  
		private String name;  
		//getter method for name  
		public String getName(){  
		return name;  
		}  
		//setter method for name  
		public void setName(String name){  
		this.name=name;
		}  
		
	public static void main(String[] args) {
		GetterSettermethod obj = new GetterSettermethod();
		obj.setName("Saravanan");
		System.out.println(obj.getName());  
	}

}
