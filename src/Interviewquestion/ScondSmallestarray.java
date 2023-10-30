package Interviewquestion;

import java.util.Arrays;

public class ScondSmallestarray {

	public static void main(String[] args) {
		int arr[]= {12,3,1,45,2,74,2};
		int smallest=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<smallest) {
				smallest=arr[i];
			}
		}
		System.out.println(smallest);
		int second_small=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<second_small&&arr[i]>smallest) {
				second_small=arr[i];
			}
		}
		System.out.println(second_small);
		
		Arrays.sort(arr);
		System.out.println(arr[1]);
	}

}
