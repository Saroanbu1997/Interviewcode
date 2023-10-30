package Interviewquestion;

public class IntegerPalindrome {

	public static void main(String[] args) {
int r,sum=0,temp;
int n=343;
temp=n;
while(n!=0) {
	//r=n%10;
	r=sum*10;
	//sum=sum*10+r;
	sum=r+n%10;
	n=n/10;
}

if(temp==sum) {
	System.out.println("Palindromeexp");
}else {
	System.out.println("not Palindromeexp");

}

	}

}
