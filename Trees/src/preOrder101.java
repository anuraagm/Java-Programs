import java.util.*;
public class preOrder101 
{	
	static binaryTreeNode root = new binaryTreeNode();
	static int nodecount = 0;
	int treeContent[] = new int[100];
	void insert(binaryTreeNode parent, int data)
	{
		System.out.println("Parent: "+parent.getData());
		binaryTreeNode node = new binaryTreeNode(data);
		boolean placed = false;
		if(nodecount == 0)
		{
			root = node;
		}
		else
		{
			while(placed == false)
			{
				if(parent.getLeft() == null && parent.getData() > node.getData()){
					System.out.println("node= "+node.getData());
					parent.setLeft(node);
					placed = true;
				}
				else if(parent.getLeft() != null && parent.getData() > node.getData()){
					parent = parent.getLeft();
					System.out.println("parent= "+parent.getData());
					insert(parent,data);
				}
				else if(parent.getRight() == null && parent.getData() < node.getData()){
					parent.setRight(node);
					placed = true;
				}
				else if(parent.getRight() != null && parent.getData() < node.getData()){
					parent = parent.getRight();
					insert(parent,data);
				}
				else
					System.out.println("Eh go bro!");
					display();
			}
		}
		nodecount+=1;
	}
	void pre(binaryTreeNode parent){
		binaryTreeNode node = new binaryTreeNode();
		Stack<binaryTreeNode> treeNode = new Stack<binaryTreeNode>();
		System.out.println(parent.getData());
		treeNode.push(parent);
		while(parent.getLeft() != null){
			parent = parent.getLeft();
			System.out.println(parent.getData());
			treeNode.push(parent);
		}
		while(!treeNode.isEmpty()){
			parent = treeNode.pop();
			if(parent.getRight() != null){
				node = parent.getRight();
				pre(node);
			}
			else{
				continue;
			}
		}
		if(root.getLeft() == null){
			parent = root;
			while(parent.getRight() != null){
				parent = parent.getRight();
				System.out.println(parent.getData());
			}
		}
	}
	void in(binaryTreeNode parent){
		
	}
	void display()
	{
		Scanner sc = new Scanner(System.in);
		preOrder101 ob = new preOrder101();
		int ch, elem, max=0;
		do{
			System.out.println("1.Insert 2.Pre-Order 3.Exit");
			try{
				ch = sc.nextInt();
				switch(ch){
				case 1: System.out.println("Enter element: ");
				        elem = sc.nextInt();
				        if(elem > max){
				        	max = elem;
				        }
					    ob.insert(ob.root,elem);
					    break;
				case 2: ob.pre(ob.root);
					    break;
				case 3: ob.in(ob.root); 
				case 4: return;
				default: System.out.println("No such option!");
				         continue;
				}
			}catch(InputMismatchException e){
				System.out.println("LOL! Enter some valid integer bro!");
				display();
			}
		}while(true);
	}
	public static void main(String[] args) 
	{
		preOrder101 ob = new preOrder101();
		ob.display();
	}

}
