package house;

public class Dog extends Animal {
	public Dog() {	// Default 持失切
    }
    public void sleep() {
        System.out.println(this.name + " zzz");
    }
	 public static void main(String[] args) {
	        Dog dog = new Dog(); // Default 持失切 硲窒
	        dog.setName("poppy");
	        System.out.println(dog.name);
	        dog.sleep();
	    }
}
