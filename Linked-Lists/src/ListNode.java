public class ListNode {
	private int data = 0;
	private ListNode next;
	public ListNode(){
		this.data = 0;
		this.next = null;
	}
	public ListNode(int data){
		this.data = data;
		this.next = null;
	}
	public void setData(int data){
		this.data = data;
	}
	public int getData(){
		return this.data;
	}
	public void setNext(ListNode elem){
		this.next = elem;
	}
	public ListNode getNext(){
		ListNode var;
		var = this.next;
		return var; 
	}
}
