package day1Sun;

public class Stringreverse2
{
	public static void main(String[] args)
	{
		
		String word = "sandhya";
		char[] ch = word.toCharArray();
		
		for(int i=ch.length-1;i >= 0;i--){
			System.out.print(ch[i]);
		}
	}

}
