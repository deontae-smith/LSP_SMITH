package org.howard.edu.lsp.finalExam;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.howard.edu.lsp.assignment5.implementation.IntegerSetException;
import org.howard.edu.lsp.assignment6.integerset.IntegerSet;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MapUtilitiesTest {

	@Test
	@DisplayName("HashMaps JUnit Test")
	public void testMapUtilities() throws NullMapException {
		HashMap<String, String> map1 = new HashMap<>();
		map1.put("Alice", "Healthy");
		map1.put("Mary", "Ecastic");
		map1.put("Bob", "Happy");
		map1.put("Chuck", "Fine");
		map1.put("Felix", "Sick");
		HashMap<String, String> map2 = new HashMap<>();
		map2.put("Mary", "Ecastic");
		map2.put("Felix", "Healthy");
		map2.put("Ricardo", "Subperb");
		map2.put("Tam", "Fine");
		map2.put("Bob", "Happy");
		
		MapUtilities m = new MapUtilities();
		assertEquals(2, m.commonKeyValuePairs(map1,map2));
		
		
	}
	
	@Test
	@DisplayName("HashMapsEmpty JUnit Test")
	public void testMapUtilitiesEmpty() throws NullMapException {
		HashMap<String, String> map1 = new HashMap<>();
		HashMap<String, String> map2 = new HashMap<>();	
		MapUtilities m = new MapUtilities();
		assertEquals(0, m.commonKeyValuePairs(map1,map2));
		

}
	
	
	@Test
	@DisplayName("HashMapsNullEXCEPTION JUnit Test")
	public void testMapUtilities_THROWS_EXCEPTION1() {
		
		HashMap<String, String> map1 = new HashMap<>();
		HashMap<String, String> map2 = new HashMap<>();	
		MapUtilities m = new MapUtilities();
		

		Exception exception = assertThrows(NullMapException.class, () -> {
			m.commonKeyValuePairs(null,map2);
			
		}
		);
		
		
			
		
	
		
			
		

		
		
		
	}
	
	
	}
	


