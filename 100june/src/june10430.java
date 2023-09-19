import java.util.Scanner;

public class june10430 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Long A, B, C;
		
		A = sc.nextLong();
		B = sc.nextLong();
		C = sc.nextLong();
		
		System.out.println((A+B)%C);
		System.out.println(((A%C) + (B%C))%C);
		System.out.println((A*B)%C);
		System.out.println(((A%C) * (B%C))%C);
	}

}
