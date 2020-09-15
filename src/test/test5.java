package test;

import java.util.Scanner;

public class test5 {
	
	public static void main(String[] args){
		int a;
		Scanner input=new Scanner(System.in);
		while(true){
			a=input.nextInt();
			String[] s=new String[a];
			for(int i=0;i<a;i++){
				s[i]=input.next();
			}
		}
	}

	
}
