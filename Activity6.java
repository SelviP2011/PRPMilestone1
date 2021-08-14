package Milestone_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Activity6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    char[] s=sc.next().toCharArray();
	    List<String> lst=new ArrayList<String>();
	    for(char i:s) {
	    	if(!lst.contains(Character.toString(i))) {
	    		lst.add(Character.toString(i));
	    	}
	    }
	    for(String i:lst) {
	    	System.out.print(i);
	    }
	}
}
