package test;

import java.util.ArrayList;
import java.util.LinkedList;

public class Testing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		Long startTime;
		Long endTime;
		Long elapsedTime;
		
		for(int i = 0; i < 1000000; i++) {
			linkedList.add(i);
			arrayList.add(i);
		}
		
		//******************LinkedList Test*****************
		startTime = System.nanoTime();
		
		linkedList.get(500000);
		endTime = System.nanoTime();
		
		elapsedTime = endTime - startTime;
		
		System.out.println("LinkedList Elapsed Time: " + elapsedTime + "ns");
		
		//******************ArrayList Test******************
		
		startTime = System.nanoTime();
		
		arrayList.get(500000);
		endTime = System.nanoTime();
		
		elapsedTime = endTime - startTime;
		
		System.out.println("ArrayList Elapsed Time: " + elapsedTime + "ns");
	}

}
