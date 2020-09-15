package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="abcde";
		String s2="abbde";
		
		List list=new ArrayList<String>();
		list.add(s1);
		list.add(s2);
		
		for(int i=0;i<list.size();i++){
			if(!list.get(i).toString().startsWith("abc"))
				list.remove(i);
		}
		
		Collections.sort(list);
		System.out.println(list);
	}

}
