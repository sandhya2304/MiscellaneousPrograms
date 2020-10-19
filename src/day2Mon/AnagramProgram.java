package day2Mon;

import java.util.Arrays;

public class AnagramProgram
{
	
	public static void isAnagram(String s1,String s2)
	{
		
		String copys1 = s1.replaceAll("\\s","");
		String copys2 = s2.replaceAll("\\s","");
		
		boolean status = true;
		
		if(copys1.length() != copys2.length()){
			status = false;
		}else{
			char[] c1 = copys1.toLowerCase().toCharArray();
			char[] c2 = copys2.toLowerCase().toCharArray();
			
			Arrays.sort(c1);
			Arrays.sort(c2);
			
			status = Arrays.equals(c1, c2);
		}
		if(status){
			
	            System.out.println(s1+" and "+s2+" are anagrams");
	        }
	        else
	        {
	            System.out.println(s1+" and "+s2+" are not anagrams");
	        }
		
	}
	
	public static void main(String[] args)
	{
         isAnagram("Mother In Law", "Hitler Woman");
         isAnagram("Toss", "Shot");
	}

}
