package com.sourav.anagram;

public class AnagramChecker {

	public static boolean isAnagram(String word1, String word2){
		// rat:art || rat:trap
		if(word1.length() != word2.length()){
			return false;
		}
		char [] w1 = word1.toCharArray();
		char [] w2 = word2.toCharArray();
		
		boolean flag = false;
		
		for(char c1 : w1){
			for(char c2 : w2){
				System.out.println(c1 + " - " + c2);
				if(c2 == c1){
					flag = true;
					break;
				}
			}
			if(!flag) return false;
		}
		return true;
	}

}
