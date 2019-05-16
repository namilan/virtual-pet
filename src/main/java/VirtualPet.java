import java.util.Random;

public class VirtualPet {
	private Random generator = new Random();
	
	//Attributes
	protected String name = "Ronny";
	protected String type;
	protected String color;	
	protected int hunger = 10;
	protected int bored = 20;
	protected int happy = 50;
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
		return hunger <= 100;
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
		bored -= 3;
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
		hunger += (5 + generateRandom());
		bored += (5 + generateRandom());
		happy -= (6 + generateRandom());
		mad += (5 + generateRandom());
		sleep += (5 + generateRandom());		
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
		if(hunger < 100 && bored < 100 && happy > 0) {
			return true;
		} else {
			return false;
		}
	}

}
