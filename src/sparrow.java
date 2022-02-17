
public class sparrow extends Bird implements flyable{

	public sparrow(int age, int weightInLbs, String Gender) {
		super(age, weightInLbs, Gender);
		
	}

	public void move() {
        System.out.println("sparrow is Flapping wings");		
}
	public void fly() {
		System.out.println("Sparrow can fly high");
		
	}

	

}
