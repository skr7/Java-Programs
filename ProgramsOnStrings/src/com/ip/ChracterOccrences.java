package com.ip;

import java.util.HashMap;
import java.util.Map;

public class ChracterOccrences {

	public static void main(String[] args) {
		charOccrences("aabdghda");

	}
	
	public static void charOccrences(String s) {
		HashMap<Character, Integer> charMap=new HashMap<>();
		
		char[] charArray=s.toCharArray();
		for(char c:charArray) {
			if(charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
			}else {
				charMap.put(c, 1);
			}
		}
		
		for(Map.Entry<Character, Integer> entry:charMap.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
