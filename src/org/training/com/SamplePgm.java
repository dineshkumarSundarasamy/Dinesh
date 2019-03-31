package org.training.com;

import java.util.ArrayList;
import java.util.List;

public class SamplePgm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> li=new ArrayList<Integer>();
		li.add(10);
		li.add(20);
		li.add(25);
		li.add(10);
		li.add(20);
		int size = li.size();
		System.out.println(size);
		Integer integer = li.get(3);
		System.out.println(integer);
		System.out.println(li);
		Integer remove = li.remove(2);
		System.out.println(remove);
		System.out.println(li);
	
		
		
		

	}

}
