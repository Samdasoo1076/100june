import java.util.Scanner;

public class june2438 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A;
		
		A = sc.nextInt();
		
		int i = 0;
		int j = 0;
		for(i = 1; i <= A; i++) {
			for(j = 1; j < i + 1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}

	}

}
