package com.sourav.anagram;

public class AnagramCreator {

	public static void createAnagram(String s){
		int sizeOfString = s.length();
		StringBuffer sb = new StringBuffer(s);
		int i,j;
		for(i=0;i<sizeOfString;i++){
			for(j=0;j<sizeOfString;j++){
				if(j==sizeOfString-1){
					break;
				}
				StringBuffer sb1 = swap(sb,j,j+1);
				System.out.println("anagram :- " + sb1.toString());
			}
		}
		
	}
	
	public static StringBuffer swap(StringBuffer s,int i, int j){
		char a = s.charAt(j);
		s.setCharAt(j,s.charAt(i));
		s.setCharAt(i, a);
		return s;
	}

}
