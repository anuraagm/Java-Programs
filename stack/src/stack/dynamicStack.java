package stack;

import java.util.*;
import java.util.InputMismatchException;
public class dynamicStack {
	public int data;
	protected int top = -1;
	protected int stackRep[];
	public static int capacity;
	public static int defaultCapacity = 5;
	
	//constructor for unspecified stack size
	public dynamicStack(){
		this.capacity = defaultCapacity;
		stackRep = new int[capacity];
	}
	
	//constructor for specified stack size
	public dynamicStack(int size){
		this.capacity = size;
		stackRep = new int[capacity];
	}
	
	//dynamic push through repeated doubling
	public void dynamicPush(int data){
		if(top == capacity-1){ //if stack is full
			int[] temp = stackRep; //temporary stack array
			top = temp.length-1;
			stackRep = new int[2*capacity]; //doubling stack size
			for(int i = 0; i < temp.length-1; i++){
				stackRep[i] = temp[i]; //copying values form temp array
			}
			stackRep[top] = temp[top];
			stackRep[++top] = data; //adding new element
		}
		else{
			stackRep[++top] = data;
		}
	}
	
	public int dynamicPop(){
		if(top == -1){
			System.out.println("Nothing in stack to pop");
			displayFunc();
		}
		else{
			int data;
			data = stackRep[top--];
			return data;
		}
		return 0;
	}
	
	public static void displayFunc(){
		Scanner sc = new Scanner(System.in);
		int ch, elem;
		dynamicStack stack = new dynamicStack();
		do{
			System.out.println("1.Push 2.Pop 3.Display 4.Exit");
			try{
			    ch = sc.nextInt();
			    switch(ch){
				case 1:	System.out.println("Enter element to push: ");
						elem = sc.nextInt();
						stack.dynamicPush(elem);
						break;
				case 2: elem = stack.dynamicPop();
				        System.out.println("Element popped is: "+elem);
						break;
				case 3: System.out.println("The stack is: ");
				 		for(int i = stack.top; i >= 0; i--){
				 			System.out.println(stack.stackRep[i]);
				 		}
				 		break;
				case 4: return;
				default: System.out.println("No such option!");
				 		 continue;	
				}
			}
			catch(InputMismatchException e){
				System.out.println("Error! Must only enter an integer option!");
				displayFunc();
			}
		}while(true);
	}
	
	public static void main(String[] args) {
		displayFunc();
	}
}