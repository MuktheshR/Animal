
public class Zoo {
	public static void main(String args[]) {
		//inheritance and program structure
		//Animal animal1 = new Animal(12,25,"M");
		//animal1.eat();
		
		//Bird bird1 = new Bird(3,12,"F");
		//bird1.move();
		//bird1.fly();
		//bird1.eat();
		//bird1.sleep();
		//chicken chick1 = new chicken(2,1,"M");
		//chick1.fly(); 
		Animal spa1 = new sparrow(1,4,"M");
		//sparrow spa = new sparrow(1,4,"M");
		//spa.move();
		//spa.fly();
		//spa1.move();
		//spa1.fly();
		//Fish fish1 = new Fish(1,3,"F");
		Animal fish1 = new Fish(1,3,"F");
		//fish1.move();
		
		moveAnimal(fish1);
		moveAnimal(spa1);
		flyable flyingbird = new sparrow(1,4,"M");
		flyingbird.fly();
		flyingbird.move();
		
	}
	public static void moveAnimal(Animal animal) {
		animal.move();
	}

}
