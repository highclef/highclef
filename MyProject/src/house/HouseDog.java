package house;

public class HouseDog extends Dog {
	  public HouseDog(String name) { // 생성자 (Constructor): method 명 = class 명, 리턴값 없음
	        this.setName(name);
	    } 
	  public HouseDog(int type) {	// 입력항목이 다른 생성자 (Constructor overloading)
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
	        HouseDog dog = new HouseDog("happy");   // 생성자 호출 시 문자열을 전달해야 한다.
	        HouseDog yorkshire = new HouseDog(1);
	        System.out.println(dog.name);
	        System.out.println(yorkshire.name);
	    }
}