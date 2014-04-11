package com.sourav.anagram;

import java.util.List;
import java.util.Map;

public class AnagramApp {

	public static void main(String[] args) {
		boolean result = AnagramChecker.isAnagram("cat","act");
		System.out.println("Are the words anagram : -" + result);
		
		String [] testString = {"pat","tap","hat"};
		Map<String,List<String>> resultSet = AnagramFinder.findAnagram(testString);
		for(Map.Entry<String,List<String>> s : resultSet.entrySet()){
			if(s.getValue().size()==1){
				continue;
			}
			for(String s1 : s.getValue()){
				System.out.println("result set :- " + s.getKey() + " " + s1);
			}
			
		}
		
		AnagramCreator.createAnagram("house");

	}

}
