package Interviewquestion;

import java.util.Arrays;


public class SecondLargestarray {

	public static void main(String[] args) {

		int arr[]= {12,3,1,45,2,74,2};
		int largest=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>largest) {
				largest=arr[i];
			}
		}
		System.out.println(largest);
		int second_lar=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>second_lar&&arr[i]<largest) {
				second_lar=arr[i];
			}
		}
		System.out.println(second_lar);
		
		Arrays.sort(arr);
		System.out.println(arr[arr.length-2]);
	}

}
