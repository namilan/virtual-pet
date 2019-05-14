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
	}
	
	public void feedAGopher() {
		hunger -= 100;
	}
	
	public boolean isStarving() {
		return hunger >=120;
	}
	
	//Bored
	
	public int getBored() {
		return this.bored;
	}
	
	public int getHappy() {
		return this.happy;
	}
	
	public int getMad() {
		return this.mad;
	}
	
	public int getSleep() {
		return this.sleep;
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
