import java.util.Random;

public class DrunkenWalk {
	public static void main(String[] args) {
		Random r = new Random();
		int noOfTimes = r.nextInt(400) + 50;
		int fellDownCount = 0;
		for(int i = 1; i <= noOfTimes; i++) {
			// everytime boundary and steps are picked randomly between 10-60 and 100-600
			int boundary = r.nextInt(60 - 10 + 1) + 10;
			int maxSteps = r.nextInt(600 - 100 + 1) + 100;
			RandomWalk walk = new RandomWalk(maxSteps, boundary);
	        walk.walk();
			if (!walk.inBounds()) { fellDownCount++; }
		}
		System.out.println("The program ran for "+noOfTimes+" and drunker fell down "+fellDownCount+" times.");
	}
}
