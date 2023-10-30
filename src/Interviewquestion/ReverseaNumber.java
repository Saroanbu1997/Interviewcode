package Interviewquestion;

public class ReverseaNumber {

	public static void main(String[] args) {
int reverse = 0,given=323;
int temp=given;
while(given!=0) {
	reverse=reverse*10;
	reverse=reverse+given%10;
	given=given/10;
}

System.out.println(reverse);
if(temp==reverse) {
	System.out.println("plan");
}else
{
	System.out.println("not plan");
}
	}

}
