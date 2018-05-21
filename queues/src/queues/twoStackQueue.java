package queues;
import java.util.*;
public class twoStackQueue {
	static int stack1Size = 0;
	static int stack2Size = 0;
	static int stack1[] = new int[5];
	static int stack2[] =  new int[5];
	static Scanner sc = new Scanner(System.in);
	static void add(){
		int elem;
		if(stack1Size < 5){
			System.out.println("Enter the element to add: ");	
			elem = sc.nextInt();
			stack1[stack1Size] = elem;
			stack1Size += 1;
			stack2Size = 0;
			for(int i = stack1Size-1; i >= 0; i--){
				stack2[stack2Size] = stack1[i];
				stack2Size+=1;
			}
		}
		else{
			System.out.println("Overflow!");	
		}
	}
	static void remove(){
		if(stack2Size > 0){
			System.out.println("The element removed is: "+stack2[stack2Size-1]);
			for(int i = stack1Size; i >= 0; i--){
				stack1[stack1Size-1] = stack1[stack1Size];
			}
		}
		else{
			System.out.println("Underflow!");
		}
	}
	static void display(){
		for(int i = 0; i < stack1Size; i++){
			System.out.println(stack1[i]);
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
			case 2: remove();
					break;
			case 3: display();
					break;
			case 4: break;
			default: System.out.println("Enter a valid option!");
			}
		}while(ch != 4);
	}
}


