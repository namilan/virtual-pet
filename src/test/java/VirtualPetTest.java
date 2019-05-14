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
	
	

}
