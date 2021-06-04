import java.util.Comparator;

public class Day3AgeCompare implements Comparator {
	public int compare(Object o1, Object o2) {
		Day3Player p1 = (Day3Player)o1;
		Day3Player p2 = (Day3Player)o2;
		
		// If the ages are the same
		if(p1.age == p2.age) {
			return 0;
		}
		// If the player 1 is greater than player 2 in age
		else if (p1.age > p2.age) {
			return 1;
		}
		else 
			return -1;		
	}
}
