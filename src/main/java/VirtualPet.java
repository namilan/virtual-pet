import java.util.Random;

public class VirtualPet {
	private Random generator = new Random();
	
	//Attributes
	protected String name = "Ronny";
	protected String type;
	protected String color;	
	protected int hunger = 50;
	protected int bored = 50;
	protected int happy = 60;
	protected int mad = 10;
	protected int sleep = 50;
	
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
		hunger += 15;
	}  
	
	public boolean isStarving() {
		return hunger >=120;
	} 
	
	//Bored
	
	public int getBored() {
		return this.bored;
	}
	
	public boolean isBored() {
		return bored >=20;
	}
	
	public void playGame() {
		hunger += 5;
		bored -= 10;
	} 
		
	// Happy
	
	public int getHappy() {
		return this.happy;
	}
	
	//Happy Actions
	public boolean isHappy() {
		return happy >= 60;
	}
	
	//Mad
	
	public int getMad() {
		return this.mad;
	}
	
	//Mad Actions
	public boolean isMad() {
		return mad <=10;
	}
	
	//Sleep
	
	public int getSleep() {
		return this.sleep;
	}
	
	//Sleep Actions
	public boolean isSleep() {
		return sleep <=5;
	}
	
	public int generateRandom() {
		return generator.nextInt(10);
	}
	

	
	//Tick Generator
	public void tick() {
		hunger += (25 + generateRandom());
		bored -= (50 + generateRandom());
		happy += (60 + generateRandom());
		mad -= (10 + generateRandom());
		sleep -= (50 + generateRandom());		
	}
	
	//Tick Reset
	public void reset() {
		hunger = 50;
		bored = 50;
		happy = 50;
		mad = 50;
		sleep = 0;
		
	}
	boolean isAlive() {
		if(hunger < 100 && bored < 100 && happy < 100) {
		return true;
		} else {
			return false;
		}
	}

}
