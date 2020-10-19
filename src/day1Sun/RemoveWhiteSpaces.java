package day1Sun;

import java.util.Scanner;

public class RemoveWhiteSpaces
{
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter input String");
		String input = sc.nextLine();
		
		String withoutSpaces = input.replaceAll("\\s+","");
		System.out.println("input string: "+input + " : "+withoutSpaces);

	}

}
