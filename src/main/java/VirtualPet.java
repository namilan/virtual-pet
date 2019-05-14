import java.util.Random;

public class VirtualPet {
//	private Random generator = new Random();
	
	protected String name;
	protected String type;
	protected String color;
//	private int hunger;
//	private int bored;
//	private int happy;
//	private int mad;
//	private int sleep;

	public VirtualPet(String petName, String typeOfPet, String color) {
		petName = this.name;
		typeOfPet = this.type;
		color = this.color;
		
	}

	public String getPetName() {
		return this.name;
	}

	public String getPetType() {
		return this.type;
	}
	
	public String getColor() {
		return this.color;
	}

}
