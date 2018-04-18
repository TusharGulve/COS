package Nadsoft.COS;

public class Demo3 {

	public static void main(String[] args)
	{
		int n=10,
		t1 = 0,
		t2 = 1;
		
		/*for(int i =1; i<=n; i++)
		{
			System.out.println(t1);
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
					
		}*/
		
		
		while (t1<=n)
		{
			int i = 1;
			System.out.println(t1);
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
			i++;
					
		}
		
		

	}

}
