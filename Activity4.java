package Milestone_1;

import java.util.Scanner;

public class Activity4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int fact=1;
		for(int i=1;i<n+1;i++) {
			fact*=i;
		}
		System.out.print("The factorial of "+n+" is "+fact);
	}
}
