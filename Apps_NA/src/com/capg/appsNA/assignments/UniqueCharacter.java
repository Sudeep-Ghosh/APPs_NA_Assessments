package com.capg.appsNA.assignments;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharacter {
	public static void main(String[] args) {
		String str = "Sudeep";
		int size = str.length();
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0;i<size;i++) {
			if(map.containsKey(str.charAt(i))) {
				map.remove(str.charAt(i));
			}else{
				map.put(str.charAt(i), 1);
			}
				
		}
		System.out.println(map);
		
	}
}
