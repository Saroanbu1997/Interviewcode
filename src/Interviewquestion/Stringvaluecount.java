package Interviewquestion;

import java.util.HashMap;

public class Stringvaluecount {

	public static void main(String[] args) {
		String word="Saravanan";
		
		HashMap<Character, Integer>	hashmap = new HashMap<Character, Integer>();
		//HashMap<String, Integer>	hashmap = new HashMap<String, Integer>();
		// if i use string in generic i'll get The method put(String, Integer) in the type HashMap<String,Integer> is not applicable for the arguments (char, int)
		for(int i=0;i<word.length();i++) {
			if(!hashmap.containsKey(word.charAt(i))) {
				hashmap.put(word.charAt(i), 1);
			}else {
				int count =hashmap.get(word.charAt(i));
				hashmap.put(word.charAt(i), count+1);

			}
		}
		System.out.println(hashmap.entrySet());
	}

}
