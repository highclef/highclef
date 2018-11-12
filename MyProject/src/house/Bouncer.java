package house;

public class Bouncer {
	public void barkAnimal(Barkable animal) {
	    animal.bark();
	}

    public static void main(String[] args) {
        Tiger tiger = new Tiger();
        Lion lion = new Lion();

        Bouncer bouncer= new Bouncer();
        bouncer.barkAnimal(tiger);
        bouncer.barkAnimal(lion);
        // 자식 클래스에 의해서 만들어진 객체는 언제나 부모 클래스의 자료형으로 사용할 수가 있다.
        /*
        Animal tiger = new Tiger();
		Animal lion = new Lion();
        */
    }
}
