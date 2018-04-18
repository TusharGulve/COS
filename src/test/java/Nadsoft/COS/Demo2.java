package Nadsoft.COS;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) 
	{
		
		int year;
		//boolean valid = true;
		String valid = "true";
		Scanner scan = new Scanner(System.in);
		//while(valid=="true")
		for(int i=1; i<=5; i++)
		{
		
		System.out.println("Enter any year : ");
		year = scan.nextInt();
		/*if(year==0){
			valid = "false";
		}else{*/
			boolean isLeap = false;
			
			if(year%4 == 0)
			{
				if(year%100 == 0)
				{
					if(year%400 == 0)
						isLeap = true;
					else
						isLeap = false;
						
				}
				else
					isLeap = true;
			}
			else
			{
				isLeap = false;
			}
			
			if(isLeap == true)
				System.out.println(year + " is a leap year\n");
			else
				System.out.println(year + " is not a leap year\n");
		}
		
		
		scan.close();
	}
		

}
	

