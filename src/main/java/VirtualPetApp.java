import java.util.Scanner;

public class VirtualPetApp {

	public static void main(String[] args) {
		
		VirtualPet raptor = new VirtualPet("Ronny","Raptor","Red");
		Scanner input = new Scanner(System.in);
		
		boolean gamePlay = true;
		
				
		System.out.println("*Screeeech* *Rawwwrrr*");
		System.out.println(" e-e ");
		System.out.println("(\\_/)\\");
		System.out.println(" `-'\\ `--.___,");
		System.out.println("    ;\\( ,_.-' ");
		System.out.println("      \\\\ ");
		System.out.println("       ^'");
		System.out.println("Hello, meet " + raptor.getPetName() + " the Raptor! He's excited to meet you!");
 
		do {
			
			System.out.println("Here is the current levels for " +raptor.getPetName()+ ":");
			System.out.println("Hunger Level: " +raptor.getHunger());
			System.out.println("Boredom Level: " +raptor.getBored());
			System.out.println("Happy Level: " +raptor.getHappy());
			System.out.println("Sleep Level: " +raptor.getSleep());
			System.out.println("Mad Level:" +raptor.getMad());
						
		System.out.println("");
		System.out.println("What would you like to do?");
		System.out.println("1. Play with " + raptor.getPetName());
		System.out.println("2. Feed " + raptor.getPetName() + " a Gopher.");
		System.out.println("3. Check on " + raptor.getPetName() + "'s happiness.");
		System.out.println("4. Check on " + raptor.getPetName() + "'s sleep. Does he need to go to bed?");
		System.out.println("5. Is Ronny upset?");
		System.out.println("6. Display Ronny.");
		System.out.println("7. Quit.");
		
		int userInput = input.nextInt();

		switch (userInput) {
		case 1:
			if (raptor.isBored()){
				System.out.println("You played with " +raptor.getPetName()+ " and he is no longer bored!");
				raptor.playGame();
				raptor.tick();
			}else {
				System.out.println("Nevermind," +raptor.getPetName()+ " wasn't bored at all.");
				raptor.tick();
			}
			break;
			
		case 2:
			if (raptor.isHungry()) {
				System.out.println("You fed " +raptor.getPetName()+ " a gopher!");
				raptor.feedAGopher();
				raptor.tick();
			} else {
				System.out.println(raptor.getPetName()+ " wasn't hungry afterall."); 
				raptor.tick();
				}
		break;
		case 3:
			if (raptor.isHappy()) {
				System.out.println(raptor.getPetName() + " is happy!");
				raptor.getHappy();
				raptor.tick();
			} else {
				System.out.println(raptor.getPetName() + " is not happy!");
				raptor.tick();
			}
		break;
		case 4:
			if (raptor.isSleep()) {
				System.out.println(raptor.getPetName() + " is sleepy. Time to nap!");
				raptor.getSleep();
				raptor.tick();
			} else {
				System.out.println(raptor.getPetName() + " is not sleep.He wants to play!");
				raptor.tick();
			}
		break;
		
		case 5:
			if (raptor.isMad()) {
				System.out.println("Please play with " +raptor.getPetName()+ " before he gets mad!");
				raptor.getMad();
				raptor.tick();
			} else {
				System.out.println(raptor.getPetName() + "is going to run away.");
				raptor.tick();
			}
		continue;
		case 6:
			System.out.println("*Screeeech* *Rawwwrrr*");
			System.out.println(" e-e ");
			System.out.println("(\\_/)\\");
			System.out.println(" `-'\\ `--.___,");
			System.out.println("    ;\\( ,_.-' ");
			System.out.println("      \\\\ ");
			System.out.println("       ^'");
		break;
			
		case 7:
			System.out.println("Nobody likes a quitter...");
			System.exit(0);
		
		default:
			System.out.println("You did not enter a valid response. Try again.\n");
			continue;
		}
		
		}
		while (raptor.isAlive());
			
		//Tick Methods
			
//			raptor.tick();
//			
//		//Hunger Tick
//			if (raptor.isStarving()) {
//				
//			if (raptor.isStarving()) {
//				System.out.println(raptor.getPetName() + " is starving and died. Do you want to try again? (Y/N)");
//			}			
//		//MAD Tick
//			if (raptor.isMad()){
//				System.out.println(raptor.getPetName()+ " is terribly mad. He has ran away. Do you want to try again? (Y/N)");
//			}
//			
//		//Sleep Tick
//			if (raptor.isSleep()) {
//			System.out.println(raptor.getPetName()+ " really needs to sleep. Do you want to put him to sleep? (Y/N)");
//			}
//			raptor.reset();
//			int userInput = input.nextInt();
//			wantsToQuit = userInput("Y");
//			}
			
//			
//			while (wantsToQuit);
//			System.out.println("Goodbye.");
//		}
	}
				
}