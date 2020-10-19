package day2Mon;

import java.util.Scanner;

public class SumDigits {

	public static void main(String[] args) {
		
		long number;
		long sum;
		
		Scanner sc =new Scanner(System.in);
		number = sc.nextLong();
		
		for(sum = 0 ; number != 0; number /= 10){
			sum += number % 10;
		}
      System.out.println("sum of digits :"+ sum);
	}

}
