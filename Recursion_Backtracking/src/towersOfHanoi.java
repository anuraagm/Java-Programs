import java.util.*;

public class towersOfHanoi {
	public static void towerOfHanoi(int numDisc, char source, char dest, char aux){
		//If number of discs is 1
		if(numDisc == 1){
			System.out.println("Move disc "+numDisc+ " form "+source+" to "+dest);
			return;
		}
		//else if numDisc != 1
		towerOfHanoi(numDisc-1, source, aux, dest);
		System.out.println("Move disc "+numDisc+ " from "+source+ " to "+dest);
		towerOfHanoi(numDisc-1, aux, source, dest);
	}
	public static void main(String[] args) {
		System.out.println("Enter number of discs: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		towerOfHanoi(num,'S','A','D');	
	}

}
