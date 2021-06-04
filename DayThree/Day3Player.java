// COMPARABLE
public class Day3Player implements Comparable <Day3Player>{
	public String name;
	public int ranking;
	public int age;
	
	// Parameterized Constructor
	public Day3Player(String name, int ranking, int age){
		super();
		this.name = name;
		this.ranking = ranking;
		this.age = age;
	}
	// Object constructor
	public Day3Player(Day3Player player) {
		this.name = player.name;
		this.ranking = player.ranking;
		this.age = player.age;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRanking() {
		return ranking;
	}
	public void setRanking(int ranking) {
		this.ranking = ranking;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public int compareTo(Day3Player player) {
		if(ranking == player.ranking){
			return 0;
		}
		else if (ranking > player.ranking) {
			return 1;
		}
		return -1;
	}

}
