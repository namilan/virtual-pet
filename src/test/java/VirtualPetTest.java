import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VirtualPetTest {
	VirtualPet underTest = new VirtualPet("Ronny","Raptor","Red") ;


	@Test
	public void DoesPetNameGetterWork () {
		underTest.name = "Ronny";
		assertEquals("Ronny", underTest.getPetName());
	}

	@Test
	public void DoesTypePetRaptorGetterWork() {
		underTest.type = "Raptor";
		assertEquals("Raptor", underTest.getPetType());
	}
	
	@Test
	public void DoesTheColorGetterWork() {
		underTest.color = "Red";
		assertEquals("Red", underTest.getColor());
	}
	
	@Test
	public void DoesHungerGetterWork() {
		underTest.hunger = 25;
		assertEquals(25, underTest.getHunger());
	}
	
	@Test
	public void DoesBoredGetterWork() {
		underTest.bored = 45;
		assertEquals(45, underTest.getBored());
	}
	
	@Test
	public void DoesHappyGetterWork() {
		underTest.happy = 60;
		assertEquals(60, underTest.getHappy());
	}
	
	@Test
	public void DoesMadGetterWork() {
		underTest.mad = 10;
		assertEquals(10, underTest.getMad());
	}
	
	@Test
	public void DoesSleepGetterWork() {
		underTest.sleep = 45;
		assertEquals(45, underTest.getSleep());
	}
}
