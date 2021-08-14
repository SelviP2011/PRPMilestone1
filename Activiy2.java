package Milestone_1;

import java.util.Arrays;
import java.util.Scanner;

public class Activiy2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Scanner sc=new Scanner(System.in);
         int count=1,max=1,ele=0;
         int arr[]=new int[10];
         for(int i=0;i<10;i++) {
        	 arr[i]=sc.nextInt();
         }
         Arrays.sort(arr);
         for(int i=1;i<10;i++) {
        	 if(arr[i]==arr[i-1]) {
        		 count++;
        	 }
        	 else {
        		 if(count>max) {
        			 max=count;ele=arr[i-1];
        		 }
        		 count=1;
        	 }
         }
         System.out.print(ele);
	}

}
