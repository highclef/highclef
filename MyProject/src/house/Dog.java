package house;

public class Dog extends Animal {
	public Dog() {	// Default ������
    }
    public void sleep() {
        System.out.println(this.name + " zzz");
    }
	 public static void main(String[] args) {
	        Dog dog = new Dog(); // Default ������ ȣ��
	        dog.setName("poppy");
	        System.out.println(dog.name);
	        dog.sleep();
	    }
}
