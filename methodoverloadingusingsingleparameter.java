package programs;
class A{
	public int add (int a) {
      a=+2;
      return a;
	}
	public int add (int b, int c) {
	      
	      return(b+c);
		}
	public float add (float d, float e) {
	      
	      return(d+e);
		}
}

public class methodoverloadingusingsingleparameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj =new A();
		System.out.println(obj.add(15));
		System.out.println(obj.add(15,2));
		System.out.println(obj.add(10.5f,5.2f));

	}

}
