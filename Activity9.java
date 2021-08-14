package Milestone_1;

import java.util.Scanner;

public class Activity9 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int totvalid=((80/100)*x);
		int fp=((55/100)*totvalid);
		if(x>5000) {
		   System.out.print(totvalid-fp);
		}
	}
}
