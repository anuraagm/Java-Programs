package stack;
import java.util.*;

public class fixedArrayStack {
	public static int capacity = 5, top = 0;
	protected static int stack[] = new int[capacity];
	static void push(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to push: ");
		int element = sc.nextInt();
		if(top == capacity-1){
			System.out.println("Overflow! Cannot push.");
		}
		else{
			stack[top++] = element;
		}
	}
	static void pop(){
		System.out.println("Element popped = "+ stack[top-1]);
		top--;
	}
	static void display(){
		for(int i = top-1; i >= 0; i--){
			System.out.println(stack[i]);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter 1.Push 2.Pop: 3.Display");
			int ch = sc.nextInt();
			switch(ch)
			{
			case 1: push();
				break;
			case 2: pop();
				break;
			case 3: display();
				break;
			default: break;
			}
		}
	}
}
