package queues;
import java.util.*;

public class fixedQueue {
	static int size = 5, count = 0;
	static int queue[] = new int[size];
	static void add(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to add to the queue: ");
		int element = sc.nextInt();
		if(count < size){
			queue[count++] = element;
		}
		else{
			System.out.println("Overflow!");
		}
	}
	static void deque(){
		if(count > 0){
			System.out.println("The element that has been removed is: "+queue[count-1]);
			count-=1;
		}
		else
			System.out.println("Queue is empty!");
	}
	static void display(){
		for(int i = 0; i < count; i++){
			System.out.println(queue[i]);
		}
	}
	public static void main(String[] args) {
		int ch;
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("1. Add element 2. Remove element 3. Display 4. Exit");
			ch = sc.nextInt();
			switch(ch)
			{
			case 1: add();
					break;
			case 2: deque();
					break;
			case 3: display();
					break;
			case 4: break;
			default: System.out.println("Enter a valid option!");
			}
		}while(ch != 4);
	}
}
