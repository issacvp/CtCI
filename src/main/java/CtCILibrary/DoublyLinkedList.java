package CtCILibrary;

import lombok.Data;

@Data
public class DoublyLinkedList<E> {

	private DoublyNode<E> head;
	private DoublyNode<E> tail;
	private int size;

	public void add(E e) {
		DoublyNode<E> node = new DoublyNode<E>(e);
		if(head != null) {
			node.setNext(head);
			node.setPrev(tail);
			head.setPrev(node);
			tail.setNext(node);
		} else {
			tail = node;
		}
		head = node;
		size++;
	}
	public void addToLast(E e) {
		DoublyNode<E> node = new DoublyNode<E>(e);
		if(tail != null) {
			node.setNext(head);
			node.setPrev(tail);
			head.setPrev(head);
			tail.setNext(node);
		} else {
			head = node;
		}
		tail = node;
		size++;
	}

	public void insert(E e, int position) {
		if(position == size) {
			add(e);
		} else if (position==1) {
			addToLast(e);
		} else if (position > 1 && position < size) {
			int count = 0;
			DoublyNode<E> pos = tail;
			DoublyNode<E> posPrev = null;
			DoublyNode<E> node = new DoublyNode<E>(e);
			while (count < position) {
				System.out.println(count);
				pos = pos.getPrev();
				count++;
			}
			posPrev = pos.getPrev();
			node.setNext(pos);
			node.setPrev(posPrev);
			pos.setPrev(node);
			posPrev.setNext(node);
		} 
	}
	
	public E remove(int position) {
		E e = null;
		if(position <0 || position > size) {
			return null;
		}
		
		if(position == size) {
			e  = (E) head.getData();
			head = head.getNext();
			tail.setNext(head);
		} else if ( position == 1) {
			e = (E) tail.getData();
			tail.getPrev().setNext(head);
			tail = tail.getPrev();
		} else if (position > 1 && position < size) {
			int count = 0;
			DoublyNode<E> pos = tail;
			DoublyNode<E> posPrev = null;
			DoublyNode<E> posNext = null;
			while(count < position) {
				pos = pos.getPrev();
				count++;
			}
			e = (E) pos.getData();
			posPrev = pos.getPrev();
			posNext = pos.getNext();
			posPrev.setNext(posNext);
			posNext.setPrev(posPrev);
		}
		return e;
	}
	
	public E remove() {
		DoublyNode<E> current = head;
		head = head.getNext();
		size--;
		return (E) current.getData();
	}

	public String traverse() {
		String str = "[";
		DoublyNode<E> current = head;
		while (current != tail) {
			str += current.getData() + "<=>";
			current = current.getNext();
		}
		str += tail.getData() +"]";
		return str.toString();
	}
	
	public String traverseReverse() {
		String str = "[";
		DoublyNode<E> current = tail;
		if(head !=null) {
			while (current != head) {
				str += current.getData() + "<=>";
				current = current.getPrev();
			}
			str += head.getData() +"]";
		} else {
			str = "";
		}
		return str;
	}
	
	public int find(E e) {
		int count = 1;
		DoublyNode node = tail;
		while (count <=size) {
			if(node.getData().equals(e)) {
				return count;
			}
			node = node.getPrev();
			count++;
		}
		return -1;
	}
	
	@Override
	public String toString() {
		return traverse();
	}
	

}
