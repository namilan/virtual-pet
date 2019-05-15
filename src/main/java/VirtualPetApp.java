import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		
		VirtualPet raptor = new VirtualPet("Ronny","Raptor","Red");
		
		boolean wantsToQuit = false;
		
		
		System.out.println("*Screeeech* *Rawwwrrr*");
		System.out.println(" e-e ");
		System.out.println("(\\_/)\\");
		System.out.println(" `-'\\ `--.___,");
		System.out.println("    ;\\( ,_.-' ");
		System.out.println("      \\\\ ");
		System.out.println("       ^'");
		System.out.println("Hello, meet " + raptor.getPetName() + " the Raptor! He's excited to meet you!");
			
		
		System.out.println("");
		System.out.println("What would you like to do?");
		System.out.println("1. Play with " + raptor.getPetName());
		System.out.println("2. Feed " + raptor.getPetName() + " a Gopher.");
		System.out.println("3. Check on " + raptor.getPetName() + "'s happiness.");
		System.out.println("4. Check on " + raptor.getPetName() + "'s sleep. Does he need to go to bed?");
		System.out.println("5. Is Ronny upset?");
		System.out.println("6. Display Ronny.");
		System.out.println("7. Quit.");
		
		Scanner input = new Scanner(System.in);
		String response = input.nextLine().toLowerCase();
		
//		do {
//			System.out.println(raptor.getPetName() + "'s is at hunger level: " + raptor.getHunger()+ " and the level of bored is: " +raptor.getBored()+ " and the level of happy is: " 
//					 +raptor.getHappy()+ " and the level of sleep is currently: " + raptor.getSleep());
//		if (raptor.isStarving()) {
//			System.out.println(raptor.getPetName() + " asks for another Gopher!");
//		} else {
//			System.out.println(raptor.isHungry() + " asks for just one Gopher.");
//		}

		switch (response) {
		case "1":
			if (raptor.isHappy()) {
				raptor.playGame();	
				System.out.println("You played with " +raptor.getPetName()+ " and he is no longer mad!");
			}else {
				System.out.println("Nevermind," +raptor.getPetName()+ " wasn't mad at all.");
				}
			break;
			
		case "2":
			if (raptor.isHungry()) {
				raptor.feedAGopher();
				System.out.println("You fed " +raptor.getPetName()+ " a gopher!");
				} else {
					System.out.println(raptor.getPetName()+ " wasn't hungry afterall.");
				}
		break;
		case "3":
			if (raptor.isHappy()) {
				raptor.getHappy();
				System.out.println(raptor.getPetName() + " is happy!");
			} else {
				System.out.println(raptor.getPetName() + " is not happy!");
			}
		break;
		case "4":
			if (raptor.isSleep()) {
				raptor.getSleep();
				System.out.println(raptor.getPetName() + " is sleepy. Time to nap!");
			} else {
				System.out.println(raptor.getPetName() + " is not sleep.He wants to play!");
			}
		break;
		
		case "5":
			if (raptor.isMad()) {
				raptor.getMad();
				System.out.println("Please play with " +raptor.getPetName()+ " before he gets mad!");
			} else {
				System.out.println(raptor.getPetName() + "is going to run away.");
			}
		break;
		case "6":
			System.out.println("*Screeeech* *Rawwwrrr*");
			System.out.println(" e-e ");
			System.out.println("(\\_/)\\");
			System.out.println(" `-'\\ `--.___,");
			System.out.println("    ;\\( ,_.-' ");
			System.out.println("      \\\\ ");
			System.out.println("       ^'");
		break;
			
		case "7":
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		
		default:
			System.out.println("You did not enter a valid response. Try again.\n");
			break;
		}
			
		//Tick Methods
			
			raptor.tick();
			
		//Hunger Tick
			if (raptor.isStarving() || raptor.isMad()) {
				
			if (raptor.isStarving()) {
				System.out.println(raptor.getPetName() + " is starving and died. Do you want to try again? (Y/N)");
			}			
		//MAD Tick
			if (raptor.isMad()){
				System.out.println(raptor.getPetName()+ " is terribly mad. He has ran away. Do you want to try again? (Y/N)");
			}
//			
//		//Sleep Tick
//			if (raptor.isSleep()) {
//			System.out.println(raptor.getPetName()+ " really needs to sleep. Do you want to put him to sleep? (Y/N)");
//			}
			raptor.reset();
			response = input.next().toLowerCase();
			wantsToQuit = response.contentEquals("Y");
			}
			
			
			while (wantsToQuit);
			System.out.println("Goodbye.");
}
}