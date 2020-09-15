package test;

import java.util.Scanner;

public class test4 {

	public static void main(String[] args){
		int a,b;
			Scanner input=new Scanner(System.in);
			
			a=input.nextInt();
			b=input.nextInt();
			
			int[][] map=new int[a][a];
			
			for(int i=0;i<a;i++){
				for(int j=0;j<a;j++){
					map[i][j]=0;
				}
			}
			
			for(int i=0;i<b;i++){
				int n=input.nextInt();
				int m=input.nextInt();
				map[n-1][m-1]=1;
			}
			
			isConnect(a,b,map);
			
		
		
	}
	
	public static void isConnect(int a,int b,int[][] map){
		boolean flag=false;
		for(int i=0;i<a;i++){
			for(int j=i+1;j<b;j++){
				if(map[i][j]==1||map[j][i]==1){
					flag=true;
				}
				else{
					flag=false;
				}
			}
		}
		
		if(flag==false){
			System.out.println("NO");
		}
		else
			System.out.println("YES");
	}
}
