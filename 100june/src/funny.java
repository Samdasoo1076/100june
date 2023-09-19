import java.util.Random;

public class funny {

	public static void main(String[] args) {
		 int totalPoints = 2100000000;
	        int insideCircle = 0;

	        Random random = new Random();

	        for (int i = 0; i < totalPoints; i++) {
	            double x = random.nextDouble();
	            double y = random.nextDouble();
	            double distance = Math.sqrt(x * x + y * y);

	            if (distance <= 1) {
	                insideCircle++;
	            }
	        }

	        double piApproximation = 4.0 * insideCircle / totalPoints;
	        System.out.println("근사한 원주율 값: " + piApproximation);

	}

}
