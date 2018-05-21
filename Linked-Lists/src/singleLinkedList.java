import java.util.*;

public class singleLinkedList extends ListNode{
    static ListNode head = new ListNode();
	static int length=0;
	
	void insertAtBegin(int data){
		ListNode var = new ListNode();
		if(length == 0){
			var.setData(data);
			head = var;
		}
		else{
			var.setData(data);
			var.setNext(head);
			head = var;
		}
		length+=1;
	}
	
	void insertAtEnd(int data){
		ListNode temp = new ListNode();
		ListNode var = head;
		if(length == 0){
			var.setData(data);
			head = var;
		}
		else{
			temp.setData(data);
			while(var.getNext() != null){
				var = var.getNext();
			}
			var.setNext(temp);
		}
		length+=1;
	}
	
	void insertAtPos(int pos, int data){
		ListNode temp = new ListNode();
		ListNode var = head;
		pos-=1;
		if(length == 0){
			var.setData(data);
			head = var;
		}
		else{
			if(pos == 0){
				insertAtBegin(data);
			}
			else{
				try{
				int i=0;
				temp.setData(data);
				while(i < pos-1){
					i+=1;
					var = var.getNext();
				}
				temp.setNext(var.getNext());
				var.setNext(temp);
				}catch(NullPointerException e){
					System.out.println("List index out of bounds! Enter valid index!");
					display();
				}
			}
		}
	}
	
	void deleteFromBeg(){
		if(head != null){
			ListNode var = head.getNext();
			System.out.println("Element deleted = "+head.getData());
			head = var;
			length-=1;
		}
		else{
			System.out.println("List empty!");
			display();
		}
	}
	
	void deleteFromEnd(){
		if(head != null){
			ListNode var = head;
			ListNode prev = head;
			while(var.getNext() != null){
				var = var.getNext();
			}
			if(var == head){
				System.out.println("Element deleted= "+head.getData());
				head = null;
			}
			else{
				while(prev.getNext() != var){
					prev = prev.getNext();
				}
				System.out.println("Element deleted= "+var.getData());
				prev.setNext(null);
			}
			length-=1;
		}
		else{
			System.out.println("List empty!");
			display();
		}
	}
	
	void deleteFromPos(int pos){
		try{
			ListNode var = head;
			ListNode prev = head;
			if(head != null){
				if(pos != 1){
					int i=0;
					while(i < pos-1){
						i+=1;
						var = var.getNext();
					}
					System.out.println("Element deleted= "+var.getData());
					while(prev.getNext() != var){
						prev = prev.getNext();
					}
					prev.setNext(var.getNext());
					var.setNext(null);
				}
				else{
					deleteFromBeg();
				}
				length-=1;
			}
			else{
				System.out.println("List Empty!");
				display();
			}
		}catch(NullPointerException e){
			System.out.println("LOL!Bro this list isn't even that big!");
		}
		
	}
	void show(){
		if(head == null){
			System.out.println("List empty!");
		}
		else{
			ListNode var = head;
			System.out.println(head.getData());
			while(var.getNext() != null){
				var = var.getNext();
				System.out.println(var.getData());
			}
		}
	}
	
	void display(){
		Scanner sc = new Scanner(System.in);
		singleLinkedList ob = new singleLinkedList();
		int ch, elem, pos;
		do{
			System.out.println("1.Insert begin 2.Insert end 3.Insert pos 4.Delete beg 5.Delete end 6.Delete pos 7.Display 8.Exit");
			try{
				ch = sc.nextInt();
				switch(ch){
				case 1: System.out.println("Enter element: ");
				        elem = sc.nextInt();
					    ob.insertAtBegin(elem);
					    break;
				case 2: System.out.println("Enter element: ");
				        elem = sc.nextInt();
					    ob.insertAtEnd(elem);
					    break;
				case 3: System.out.println("Enter element: ");
				        elem = sc.nextInt();
				        System.out.println("Enter position: ");
				        pos = sc.nextInt();
				        ob.insertAtPos(pos,elem);
					    break;
				case 4: ob.deleteFromBeg();
						break;
				case 5: ob.deleteFromEnd();
					    break;
				case 6:System.out.println("Enter position to delete from: ");
		 			   pos = sc.nextInt();
		 		       ob.deleteFromPos(pos);
		 		       break; 
				case 7: ob.show();
				        break;
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
		singleLinkedList ob = new singleLinkedList();
		ob.display();
	}
}
