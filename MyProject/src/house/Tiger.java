package house;

public class Tiger extends Animal implements BarkablePredator {
	public String getFood() {
        return "apple";
    }
	public void bark() {
        System.out.println("¾îÈï");
    }
}
