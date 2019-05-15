import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class VirtualPetTest {
	VirtualPet underTest = new VirtualPet("Ronny","Raptor","Red") ;


	@Test
	public void doesPetNameGetterWork () {
		underTest.name = "Ronny";
		assertEquals("Ronny", underTest.getPetName());
	}

	@Test
	public void doesTypePetRaptorGetterWork() {
		underTest.type = "Raptor";
		assertEquals("Raptor", underTest.getPetType());
	}
	
	@Test
	public void doesTheColorGetterWork() {
		underTest.color = "Red";
		assertEquals("Red", underTest.getColor());
	}
	
	@Test
	public void doesHungerGetterWork() {
		underTest.hunger = 25;
		assertEquals(25, underTest.getHunger());
	}
	
	@Test
	public void doesBoredGetterWork() {
		underTest.bored = 45;
		assertEquals(45, underTest.getBored());
	}
	
	@Test
	public void doesHappyGetterWork() {
		underTest.happy = 60;
		assertEquals(60, underTest.getHappy());
	}
	
	@Test
	public void doesMadGetterWork() {
		underTest.mad = 10;
		assertEquals(10, underTest.getMad());
	}
	
	@Test
	public void doesSleepGetterWork() {
		underTest.sleep = 45;
		assertEquals(45, underTest.getSleep());
	}
	
	@Test
	public void isHungryMethod_shouldReturnTrue() {
		underTest.hunger = 25;
//		assertEquals(true, underTest.isHungry());
		assertTrue(underTest.isHungry());
	}
	
	@Test
	public void feedRaptorGopherFullyFed() {
		underTest.hunger = 50;
		underTest.feedAGopher();
		assertEquals(75, underTest.getHunger());
	}
	
	@Test
	public void isRaptorStarving_shouldReturnTrue() {
		underTest.hunger = 120;
		assertTrue(underTest.isStarving());
	}
	
	@Test
	public void letsPlay_getsHungry() {
		underTest.hunger = 0;
		underTest.playGame();
		assertEquals(5, underTest.getHunger());
	}
	
	@Test
	public void letsPlay_notBoredAnymore() {
		underTest.bored = 55;
		underTest.playGame();
		assertEquals(45, underTest.getBored());
	}
	
	@Test
	public void isRaptorHappy_shouldReturnTrue() {
		underTest.happy = 60;
		assertTrue(underTest.isHappy());
	}
	
	@Test
	public void isRaptorMad_shouldReturnTrue() {
		underTest.mad = 10;
		assertTrue(underTest.isMad());
	}
	
	@Test
	public void isRaptorSleepy_shouldReturnTrue() {
		underTest.sleep = 5;
		assertTrue(underTest.isSleep());
	}
	
	@Test
	public void tickHungerIsTicking() {
		underTest.hunger = 25;
		underTest.getHunger();
		assertEquals(25, underTest.getHunger());
	}
	
	@Test
	public void tickBoredIsTicking() {
		underTest.bored = 45;
		underTest.getBored();
		assertEquals(45, underTest.getBored());
	}
	
	@Test
	public void tickHappyIsTicking() {
		underTest.happy = 60;
		underTest.getHappy();
		assertEquals(60, underTest.getHappy());
	}
	
	@Test
	public void tickMadIsTicking() {
		underTest.mad = 10;
		underTest.getMad();
		assertEquals(10, underTest.getMad());
	}
	
	@Test
	public void tickSleepIsTicking() {
		underTest.sleep = 5;
		underTest.getSleep();
		assertEquals(5, underTest.getSleep());
	}
	
	@Test
	public void tickResetHunger() {
		underTest.hunger = 0;
		underTest.getHunger();
		assertEquals(0, underTest.getHunger());
	}
	
	@Test
	public void tickResetBored() {
		underTest.bored = 0;
		underTest.getBored();
		assertEquals(0, underTest.getBored());
	}
	
	@Test
	public void tickResetHappy() {
		underTest.happy = 0;
		underTest.getHappy();
		assertEquals(0, underTest.getHappy());
	}
	
	@Test
	public void tickResetMad() {
		underTest.mad = 0;
		underTest.getMad();
		assertEquals(0, underTest.getMad());
	}
	
	@Test
	public void tickResetSleep() {
		underTest.sleep = 0;
		underTest.getSleep();
		assertEquals(0, underTest.getSleep());
	}
}
