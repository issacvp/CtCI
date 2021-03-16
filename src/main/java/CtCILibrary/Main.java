package CtCILibrary;

public class Main {

	public static void main(String[] args) {
		HashTable list = new HashTable();
		list.add(10);
		list.add(3);
		list.add(30);
		list.add(223);
		list.add(237);
		list.traverse();
		System.out.println(list.find(237));
		System.out.println(list.find(223));
		
	}

}
