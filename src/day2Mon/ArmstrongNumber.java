package day2Mon;

public class ArmstrongNumber {

	public static void main(String[] args)
	{
		int c= 0, a ,temp;
		
		int check =163;
		
		temp = check;
		
		while(check > 0){
			a = check % 10;
			check = check / 10;
			c = c+(a*a*a);
		}
		
		if(temp == c){
			System.out.println("armstrong");
		}else{
		System.out.println("not");
		}
	}

}
