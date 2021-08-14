package Milestone_1;

import java.util.Scanner;

public class Activity12 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int f=0;
		for(int i=2;i<x;i++) {
			if(x%i==0) {
				f=1;break;
			}
		}
		if(f==0) {
			System.out.print(x+" is prime");
		}
		else {
			System.out.print(x+" is not a prime");
		}
	}
}
