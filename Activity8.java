package Milestone_1;

import java.util.Scanner;

public class Activity8 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		if(x>0 && y>0) {
			System.out.print(((x*18)/(5*y))+5);
		}
	}
}
