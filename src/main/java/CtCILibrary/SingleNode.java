package CtCILibrary;

public class SingleNode<E> {

	private Object data = null;
	private SingleNode<E> next = null;
	@SuppressWarnings("unchecked")
	public E getData() {
		return (E) data;
	}
	public void setData(E data) {
		this.data = data;
	}
	public SingleNode<E> getNext() {
		return next;
	}
	public void setNext(SingleNode<E> next) {
		this.next = next;
	}
	public SingleNode(E data) {
		super();
		this.data = data;
	}	
}
