package Programpractice;

import java.util.HashMap;
import java.util.Map;

public class DuplicateinanArray {

	public static void main(String[] args) {
		int[] rollNo = {1,3,4,6,1,7,9,3};
		
		HashMap<Integer, Integer> duplicatecount = new HashMap<Integer, Integer>();
		
		for(int rollnoValue : rollNo) {
			
			if(duplicatecount.containsKey(rollnoValue)) {
				duplicatecount.put(rollnoValue, duplicatecount.get(rollnoValue)+1);
				
			}else {
				
				duplicatecount.put(rollnoValue, 1);
			}
		}
		
		//System.out.println(duplicatecount);
		
		for(Map.Entry<Integer, Integer> mapob : duplicatecount.entrySet()) {
			
			System.out.println("Array Value:  "+ mapob.getKey() + " "+ "Count occurance: "+ mapob.getValue());
		}

	}

}
