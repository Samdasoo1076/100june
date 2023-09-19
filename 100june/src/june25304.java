import java.util.Scanner;

interface june25304 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt(), N = sc.nextInt(), sum = 0;

        for(int i=0; i<N; i++) {
            sum += sc.nextInt() * sc.nextInt();
        }
        if(X == sum) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}