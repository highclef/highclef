package Zoo;

public class Tiger extends Predator implements Barkable {
	public String getFood() {
        return "apple";
    }
	public void bark() {
        System.out.println("¾îÈï");
    }
}
