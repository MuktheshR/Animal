
public class Bird extends Animal {
	
	
    public Bird(int age, int weightInLbs, String Gender) {
		super(age, weightInLbs, Gender);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void move() {
		System.out.println("Flapping wings....");
		
	}

		

	//public void fly() {
    	//System.out.println("Flying..");
    //}
}
