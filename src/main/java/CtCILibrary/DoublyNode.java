package CtCILibrary;

import lombok.Data;

@Data
public class DoublyNode<E> {
	private Object data;
	private DoublyNode<E> next;
	private DoublyNode<E> prev;
	public DoublyNode(Object data) {
		super();
		this.data = data;
	}
}
