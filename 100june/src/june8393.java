import java.util.Scanner;

public class june8393 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int j = 0;
		for(int i = 1; i <= A; i++) {
			 j += i;
		}
		System.out.println(j);
		
	}
}
