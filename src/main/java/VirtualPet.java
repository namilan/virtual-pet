import java.util.Random;

public class VirtualPet {
	private Random generator = new Random();
	
	//Attributes
	protected String name;
	protected String type;
	protected String color;	
	protected int hunger;
	protected int bored;
	protected int happy;
	protected int mad;
	protected int sleep;
	
	//Constructor

	public VirtualPet(String petName, String typeOfPet, String color) {
		petName = this.name;
		typeOfPet = this.type;
		color = this.color;
		
	}

	// Getters below this line 
	
	public String getPetName() {
		return this.name;
	}

	public String getPetType() {
		return this.type;
	}
	
	public String getColor() {
		return this.color;
	}
	
	//Hunger Getter

	public int getHunger() {
		return this.hunger;
	}
	
	//Hunger Actions
	
	public boolean isHungry() {
		return hunger >= 25;
	}  // needs to be tested
	
	public void feedAGopher() {
		hunger -= 100;
	}  // needs to be tested
	
	public boolean isStarving() {
		return hunger >=120;
	}  // needs to be tested
	
	//Bored
	
	public int getBored() {
		return this.bored;
	}
	
	public void play() {
		hunger += 5;
		bored -= 55;
	} // needs to be testesd
	
	
	// Happy
	
	public int getHappy() {
		return this.happy;
	}
	
	//Happy Actions
	public boolean isHappy() {
		return happy >= 60;
	} // needs to be tested
	
	//Mad
	
	public int getMad() {
		return this.mad;
	}
	
	//Mad Actions
	public boolean isMad() {
		return mad <=10;
	} // needs to be tested
	
	//Sleep
	
	public int getSleep() {
		return this.sleep;
	}
	
	//Sleep Actions
	public boolean isSleep() {
		return sleep <=45;
	
	}
	
	public int generateRandom() {
		return generator.nextInt(10);
	}
	
	//Tick Generator
	public void tick() {
		hunger += (25 + generateRandom());
		bored -= (45 + generateRandom());
		happy += (60 + generateRandom());
		mad -= (10 + generateRandom());
		sleep -= (45 + generateRandom());		
	}
	
	//Tick Reset
	public void reset() {
		hunger = 0;
		bored = 0;
		happy = 0;
		mad = 0;
		sleep = 0;
		
	}
}
