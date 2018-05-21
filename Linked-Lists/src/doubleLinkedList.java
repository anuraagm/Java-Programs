import java.util.*;

public class doubleLinkedList {
	static DLNode head = new DLNode();
	static DLNode tail = new DLNode();
	static int length = 0;
	void insertAtPos(int data, int pos){
		pos-=1;
		DLNode node = new DLNode();
		DLNode setTail = new DLNode();
		node.setData(data);
		int i = 0;
		if(length == 0){
			head = node;
			tail = node;
		}
		else{
			if(pos == 0){
				head = node;
				setTail = head;
				while(setTail != tail){
					setTail = setTail.getNext();
				}
				tail = setTail;
			}
			else if(pos == length-1){
				tail.setNext(node);
				node.setPrev(tail);
				tail = node;
			}
			else{
				DLNode temp1 = head;
				DLNode temp2 = head;
				while(i != pos){
					i += 1;
					temp1 = temp1.getNext();
				}
				System.out.println("temp1.data= "+temp1.getData());
				while(i != pos-1){
					i+=1;
					temp2 = temp2.getNext();
				}
				System.out.println("temp2.data= "+temp2.getData());
				temp1.setPrev(temp2);
				temp2.setNext(node);
				temp1.setPrev(node);
			}
	    }
		length+=1;
	}
	
	void show(){
		DLNode node = head;
		while(node != tail){
			System.out.println(node.getData());
			node = node.getNext();
		}
		System.out.println(tail.getData());
	}
	
	void display(){
		Scanner sc = new Scanner(System.in);
		doubleLinkedList ob = new doubleLinkedList();
		int ch, elem, pos;
		do{
			System.out.println("1.Insert begin 2.Display 3.Exit");
			try{
				ch = sc.nextInt();
				switch(ch){
				case 1: System.out.println("Enter position to enter: ");
						pos = sc.nextInt();
						System.out.println("Enter element: ");
				        elem = sc.nextInt();
					    ob.insertAtPos(elem,pos);
					    break; 
				case 2: ob.show();
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
		doubleLinkedList dll = new doubleLinkedList();
		dll.display();
	}

}
