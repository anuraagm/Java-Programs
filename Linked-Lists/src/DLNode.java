public class DLNode {
	private int data;
	private DLNode next;
	private DLNode prev;
	public DLNode(){
		this.data = 0;
		this.next = null;
		this.prev = null;
	}
	public DLNode(int data){
		this.data = data;
		this.next = null;
		this.prev = null;
	}
	public int getData(){
		return this.data;
	}
	public void setData(int data){
		this.data = data;
	}
	public DLNode getNext(){
		return this.next;
	}
	public DLNode getPrev(){
		return this.prev;
	}
	public void setNext(DLNode node){
		this.next = node;
	}
	public void setPrev(DLNode node){
		this.prev = prev;
	}
}
