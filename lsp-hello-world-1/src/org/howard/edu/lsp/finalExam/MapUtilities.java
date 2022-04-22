package org.howard.edu.lsp.finalExam;

import java.util.HashMap;
import java.util.Map;

import org.howard.edu.lsp.assignment5.implementation.IntegerSetException;

public class MapUtilities {
    public static int commonKeyValuePairs(
        HashMap<String, String> map1,
        HashMap<String, String> map2) throws NullMapException {
			int counter = 0;
			NullMapException e= new NullMapException();
			if (map1 == null || map2 == null) {
				throw e;
			}
			for (Map.Entry<String, String> mapElement : map1.entrySet()) {
				String key = mapElement.getKey();
				String value = mapElement.getValue();
				if (map2.containsKey(key)) {
					String secondvalue = map2.get(key);
					if (value.equals(secondvalue)) {
						counter ++;
					}
				}
			}
			
	
				
			return counter;

    }
}


