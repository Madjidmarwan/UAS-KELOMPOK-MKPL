package src.test.java;

import static org.junit.Assert.*;
import src.FXMLController.java.*;
import org.junit.Test;

public class AgeTest {

	@Test
	public void testAge() {
		calculate AgeTest = new calculate();
		
		assertEquals(testAge.getAge(), 9);
		
	}

}
