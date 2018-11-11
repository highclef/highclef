package house;

public class HouseDog extends Dog {
	  public HouseDog(String name) { // ������ (Constructor): method �� = class ��, ���ϰ� ����
	        this.setName(name);
	    } 
	  public HouseDog(int type) {	// �Է��׸��� �ٸ� ������ (Constructor overloading)
	        if (type == 1) {
	            this.setName("yorkshire");
	        } else if (type == 2) {
	            this.setName("bulldog");
	        }
	    }
	public void sleep() {
        System.out.println(this.name+" zzz in house");
    } 
	 public void sleep(int hour) {
	        System.out.println(this.name+" zzz in house for " + hour + " hours");
	    } 
	 public static void main(String[] args) {
	        // HouseDog dog = new HouseDog();
	        HouseDog dog = new HouseDog("happy");   // ������ ȣ�� �� ���ڿ��� �����ؾ� �Ѵ�.
	        HouseDog yorkshire = new HouseDog(1);
	        System.out.println(dog.name);
	        System.out.println(yorkshire.name);
	    }
}