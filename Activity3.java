package Milestone_1;

import java.util.Scanner;

public class Activity3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int num=1;
		String arr[][]=new String[n][n];
		for(int i=0;i<n;i++) {
			for(int j=i+1;j<n;j++) {
				arr[i][j]=" ";
			}
			for(int j=0;j<i+1;j++) {
		        arr[i][j]=Integer.toString(num);
		        if(num==9) {
		        	num=-1;
		        }
		        num++;
			}
		}
		for(int i=0;i<n;i++) {
			System.out.print(" ".repeat(n-i-1));
			for(int j=0;j<i+1;j++) {
				System.out.print(arr[i][j]);
			}
			for(int j=i-1;j>=0;j--) {
				System.out.print(arr[i][j]);
			}
			System.out.print("\n");
		}
	}
}
