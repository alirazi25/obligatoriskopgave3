
public class Collisions {
	public static void main(String[] args) {
		int boundary = 2000000;
		int maxSteps = 100000;
		int stepsTaken = 0;
		int collision = 0;
		RandomWalk walk1 = new RandomWalk(maxSteps, boundary, 3, 0);
		RandomWalk walk2 = new RandomWalk(maxSteps, boundary, -3, 0);
		
		while(stepsTaken < maxSteps){
			walk1.takeStep();
			walk2.takeStep();
			if(samePosition(walk1, walk2)) 
				collision++;
			stepsTaken++;
		}
		System.out.println("Total number of collisions: "+collision);
	}
	
	public static boolean samePosition (RandomWalk p1, RandomWalk p2) {
		if(p1.getX() == p2.getX() && p1.getY() == p2.getY()) {
			return true;
		}
		return false;
	}
}
