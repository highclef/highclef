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
        // �ڽ� Ŭ������ ���ؼ� ������� ��ü�� ������ �θ� Ŭ������ �ڷ������� ����� ���� �ִ�.
        /*
        Animal tiger = new Tiger();
		Animal lion = new Lion();
        */
    }
}
