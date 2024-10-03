package programs;
class computer{
	class processor{
	void displayDetails(String brand,String speed){
			System.out.println("Brand:"+brand);
			System.out.println("Speed"+speed);
			
		}
	}
}

public class innerouter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		computer c=new computer();
		computer.processor p = c.new processor();
		p.displayDetails("audi","240");

	}

}
