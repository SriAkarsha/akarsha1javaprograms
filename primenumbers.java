package programs;

public class primenumbers {

	public static void main(String[] args) {
		int n=5;
		int i=0;
		int count=10;
		for(i=2;i<n/2;i++)
		{
			if(n%i==0)
			{
				count=1;
			}
		}
		if (count==0)
		{
		System.out.println("it is not a prime num");
		}
		else
		{
			System.out.println("it is prime num");	
		}
		// TODO Auto-generated method stub

	}

}
