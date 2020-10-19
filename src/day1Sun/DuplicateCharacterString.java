package day1Sun;

import java.util.HashMap;
import java.util.Set;

public class DuplicateCharacterString
{
	
	public static void duplicateCharCount(String word)
	{

		HashMap<Character,Integer> charMap = new HashMap<>();
		char[] ch = word.toCharArray();
		
		for(char c:ch){
			if(charMap.containsKey(c)){
				charMap.put(c,charMap.get(c)+1);
			}else{
				charMap.put(c,1);
			}
		}
		
		Set<Character> set = charMap.keySet();
		System.out.println("duplicate :"+word);
		
		for(Character chh:set){
			if(charMap.get(chh) > 1){
				System.out.println(chh+"  "+charMap.get(chh));
			}
		}
		
	}
	
	public static void main(String[] args)
	{
		duplicateCharCount("sandhya");

	}

}
