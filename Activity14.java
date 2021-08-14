package Milestone_1;

import java.util.Scanner;

public class Activity14 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int x=43,y=91,z=183;
		int w=gcd(y-x,z-y);
		System.out.print(gcd(w,z-x));
	}
	static int gcd(int a, int b)
    {
      if (b == 0)
        return a;
      return gcd(b, a % b);
    }
     
}
