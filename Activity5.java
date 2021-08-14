package Milestone_1;

import java.util.Scanner;

public class Activity5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int sum=0;
		for(int i=0;i<10;i++) {
		    int n=sc.nextInt();
		    sum+=n;
		}
		System.out.print("The average is "+(sum/10));
	}
}
