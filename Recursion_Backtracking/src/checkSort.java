import java.util.*;

public class checkSort {
	public static void checkSortOrder(int[] a, int num, int check){
		if(check >= num-1){
			System.out.println("This list is sorted");
		}
		else{
			if(a[check] <= a[check+1]){
				check++;
				checkSortOrder(a, num, check);
			}
			else
				System.out.println("Error! This list is not sorted");
		}
	}
	public static void main(String[] args) {
		int a[];
		int num, check = 0;
		System.out.println("Enter the number of elments in the list: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		a = new int[num];
		System.out.println("Enter the elements: ");
		for(int i = 0; i < num; i++){
			a[i] = sc.nextInt();
		}
		checkSortOrder(a,num,0);
	}

}
