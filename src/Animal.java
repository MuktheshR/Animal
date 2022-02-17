
public abstract class Animal {
     int age;
     int weightInLbs;
     String Gender;
     
     public Animal(int age,int weightInLbs, String Gender)
     {
    	 this.age= age;
    	 this.Gender= Gender;
    	 this.weightInLbs= weightInLbs;
     }
     public void eat() {
    	 System.out.println("eating....");
     }
     public void sleep() {
    	 System.out.println("sleeping....");
     }
     public abstract void move();
}
