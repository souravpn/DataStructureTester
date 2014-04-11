package com.sourav.anagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramFinder {

	public static Map<String,List<String>> findAnagram(String [] testString){

		Map<String,List<String>> anagramMap = new HashMap<String,List<String>>();
		for(String s : testString){
			char [] c = s.toCharArray();
			Arrays.sort(c);
			String key = new String(c);
			if(anagramMap.get(key) == null){
				List<String> values = new ArrayList<String>();
				values.add(s);
				anagramMap.put(key,values);
			}else{
				List<String> values = anagramMap.get(key);
				values.add(s);
			}
		}
		
		return anagramMap;
			
	}

}
