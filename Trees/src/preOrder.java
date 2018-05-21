import java.util.*;
public class preOrder {
	static int nodecount=0;
	static binaryTreeNode root = new binaryTreeNode();
	void insert(binaryTreeNode parent, int data){
		binaryTreeNode node = new binaryTreeNode(data);
		System.out.println("parent.data= "+parent.getData());
		System.out.println("node.data= "+node.getData());
		int placed[] = new int[data+1];
		if(nodecount == 0){
			root = node;
		}
		else{
			System.out.println("came here placed["+data+"]= "+placed[data] );
			while(placed[data] != 1){
				System.out.println("placed["+data+"]= "+placed[data]);
				if(node.getData() < parent.getData()){ 
					if(parent.getLeft() != null){
						parent = parent.getLeft();
						insert(parent,data);
					}
				    else{
				    	System.out.println("Entered exit condition 1");
				    	parent.setLeft(node);
				    	placed[data] += 1;
				    	System.out.println("placed["+data+"]= "+placed[data]);
				    }			    	
				}
				else if(node.getData() > parent.getData()){
					if(parent.getRight() != null){
						parent = parent.getRight();
						insert(parent,data);
					}
					else{
						System.out.println("Entered exit condition 2");
						parent.setRight(node);
						placed[data] += 1;
						System.out.println("placed["+data+"]= "+placed[data]);
					}
				}
				else{
				//	placed[data] += 1;
					break;
				}
			}
			System.out.println("Came here next");
			System.out.println("placed["+data+"]= "+placed[data]);
		}
		nodecount += 1;
	}
	void preOrder(int max){
		binaryTreeNode node = root;
		binaryTreeNode var = new binaryTreeNode();
		int visited[] = new int[max];
		int count = nodecount;
		Stack<binaryTreeNode> res = new Stack<binaryTreeNode>();
		while(count > 0){
			System.out.println(node.getData());
			if(node.getLeft() != null){
				res.push(node);
				node = node.getLeft();
				visited[node.getData()] = 1;
				count -= 1;
			}
			else{
				if(!res.isEmpty()){
					var = res.pop();
					var = var.getRight();
					node = var;
				}
				count-=1;
			}
		}
	}
	void display(){
		Scanner sc = new Scanner(System.in);
		preOrder ob = new preOrder();
		int ch, elem, max=0;
		do{
			System.out.println("1.Insert 2.Display 3.Exit");
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
				case 2: System.out.println("Pre-order traversed tree is: ");
				        ob.preOrder(max);
					    break;
				case 3: break;
				default: System.out.println("No such option!");
				         continue;
				}
			}catch(InputMismatchException e){
				System.out.println("LOL! Enter some valid integer bro!");
				display();
			}
		}while(true);
	}
	public static void main(String[] args) {
		preOrder ob = new preOrder();
		ob.display();
	}

}
