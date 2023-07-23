package com.capg.appsNA.assignments;

import java.util.HashMap;
import java.util.Map;

public class RepeatedCharacter {
	public static void main(String[] args) {
		String str ="Suddeepp";
		int size = str.length();
		
		Map<Character, Integer> map = new HashMap<>();
		
		for(int i=0;i<size;i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}else {
				map.put(str.charAt(i), 1);
			}
		}
		
		for(Map.Entry<Character, Integer> mp : map.entrySet()) {
			if(mp.getValue()>1) {
				System.out.println(mp);
			}
		}
		
	}
}
