package test;
import java.util.*;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a=new int[]{1,3,6,5,2,4};
		int[] b=new int[]{2,3};
		
	
		
		select(a,b);
	}

	
	public static void select(int[] a,int[] b){
		int x=a.length;
		int y=b.length;
		
		List same=new ArrayList<Integer>();
		
		for(int i=0;i<x;i++){
			for(int j=0;j<y;j++){
				if(a[i]==b[j])
					same.add(a[i]);
			}
		}
		
		List all=new ArrayList<Integer>();
		for(int i=0;i<x;i++){
			all.add(a[i]);
		}
		for(int i=0;i<y;i++){
			all.add(b[i]);
		}
		
	//	Iterator iterator=all.iterator();
		
	/*	for(int i=0;i<same.size();i++){
			while(iterator.hasNext()){
				if(same.get(i).equals(iterator.next()))
					iterator.remove();
			}
		}*/
		
		all.removeAll(same);
		Collections.sort(all);
	
		System.out.println(all);
	}
}
