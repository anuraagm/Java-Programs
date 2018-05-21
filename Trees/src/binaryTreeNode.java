public class binaryTreeNode {
	private int data;
	private binaryTreeNode left,right;
	public binaryTreeNode(){
		this.data = 0;
	}
	public binaryTreeNode(int data){
		this.data = data;
	}
	public int getData(){
		return this.data;
	}
	public void setData(int data){
		this.data = data;
	}
	public void setLeft(binaryTreeNode node){
		this.left = node;
	}
	public void setRight(binaryTreeNode node){
		this.right = node;
	}
	public binaryTreeNode getLeft(){
		return this.left;
	}
	public binaryTreeNode getRight(){
		return this.right;
	}
}
