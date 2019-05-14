

public class VirtualPet {
	
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

	// Getters
	
	public String getPetName() {
		return this.name;
	}

	public String getPetType() {
		return this.type;
	}
	
	public String getColor() {
		return this.color;
	}

	public int getHunger() {
		return this.hunger;
	}

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
}
