package programs;

public class exceptionss {

	public static void main(String[] args) {
		try {
			int[] A= {1,2,3,4};
			System.out.println(A[10]);
		}
		catch(Exception e)
		{
			System.out.println("Exception occured");
			}
	}
	


