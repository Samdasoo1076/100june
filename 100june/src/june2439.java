import java.util.Scanner;

public class june2439 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		for(int i = 0; i < A; i++) {
			for(int j = 0; j < A; j++) {
				if(j < A - i -1)System.out.print("");
				else System.out.print("*");
			}
			System.out.println("");
		}
	}

}
