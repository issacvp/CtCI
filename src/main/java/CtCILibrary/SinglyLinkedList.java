package CtCILibrary;

public class SinglyLinkedList<E> {
	private SingleNode<E> head;
	private SingleNode<E> start;
	private int size;

	public SingleNode<E> getHead() {
		return head;
	}

	public void setHead(SingleNode<E> head) {
		this.head = head;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public void add(E e) {
		SingleNode<E> node = new SingleNode<E>(e);
		node.setNext(head);
		head = node;
		size++;
	}

	@SuppressWarnings("unchecked")
	public E remove() {
		SingleNode<E> current = head;
		head = head.getNext();
		size--;
		return (E) current.getData();
	}

	@Override
	public String toString() {
		String str = "[";
		SingleNode<E> current = head;
		while (current != null) {
			str += current.getData().toString() + "=>";
			current = current.getNext();
		}
		str += "start ]";
		return str.toString();
	}
}
