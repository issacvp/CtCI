package CtCILibrary;

import java.util.ArrayList;
import java.util.List;

public class HashTable {
	private List<DoublyLinkedList<Integer>> list = new ArrayList<>();
	public HashTable() {
		for(int i = 0; i<10; i++) {
			list.add(new DoublyLinkedList<Integer>());
		}
	}
	private int getHash(int val) {
		return val%10;
	}
	public void add(int val) {
		list.get(getHash(val)).add(val);
	}
	public void traverse() {
		for(int i = 0; i < 10 ; i++) {
			if(list.get(i)!= null) {
				System.out.println("["+i+"] --> "+ list.get(i).traverseReverse() );
			}
		}
	}
	public int find(int val) {
		return list.get(getHash(val)).find(val);
	}
	
}
