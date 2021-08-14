package Milestone_1;

import java.util.Scanner;

public class Activity10 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i=1;
		while(true) {
			int sq=i*i;
			if((sq%21==0 && sq%36==0 && sq%66==0)) {
				System.out.print(sq);
				break;
			}
			i++;
		}
	}
}
