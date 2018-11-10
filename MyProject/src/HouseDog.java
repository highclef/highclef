
public class HouseDog extends Dog {
	  public HouseDog(String name) { // 생성자 (Constructor): method 명 = class 명, 리턴값 없음
	        this.setName(name);
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
	        System.out.println(dog.name);
	    }
}