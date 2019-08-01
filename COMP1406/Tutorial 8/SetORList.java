package comp1406t8;

import java.util.HashSet;
import java.util.ArrayList;

public class SetORList{

	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<Integer>();
		HashSet<Integer> set = new HashSet<Integer>();

		int size = 100;

		System.out.print("making collections... ");
		for(int i=0; i<size; i+=1){
			list.add(i);
			set.add(i);
		}
		System.out.println("done!");

		long start_time = System.nanoTime();
		for(int i=0; i<2*size; i+=1){
			set.contains(i);
		}
		long set_time = System.nanoTime()-start_time;
		System.out.println("set time  (" + size + " searches)= " + (set_time*1e-9));

		start_time = System.nanoTime();
		for(int i=0; i<2*size; i+=1){
			list.contains(i);
		}
		long list_time = System.nanoTime()-start_time;

		System.out.println("list time (" + size + " searches)= " + (list_time*1e-9));

		HashSet<Integer> s = new HashSet<Integer>();
		for(int i=0; i<10; i+=1){
			s.add(i);
		}

		//System.out.println(s);
		//java.util.Collections.sort(s);
		//System.out.println(s);


		/*
		for 25000 -->
			set time (25000 searches) = 0.00466910000000001
			list time (25000 searches) = 1.2418014000000002

		for 1000 -->
			set time (1000 searches) = 3.8790000000005E-4
			list time (1000 searches) = 0.0082831

		for 20000 -->
			set time (20000 searches) = 0.0078856000000001
			list time (20000 searches) = 1.8480137

		for 100 -->
			set time (100 searches) = 4.131E-4
			list time (100 searches) = 0.0018398000000000002

		ArrayList operation is O(n)
		HashList operation is O(1)


		*/
	}


}
