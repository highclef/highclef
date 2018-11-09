# java
To study java

05-3. Call by Value
class 이름이 파일명과 동일할 경우, public으로 선언할 것.

<Counter.java>
class Update {
}
public class Counter { 
}

05-4. 상속

자식클래스 extends 부모클래스
부모클래스 A = new 자식클래스();
Object B = new 클래스이름(); // 자바에서 만드는 모든 객체는 object형으로 사용할 수 있다.

자바는 다중 상속을 지원하지 않는다.

Method overloading
메소드의 입력 파라미터가 다를 경우 가능.

public void sleep() {
}
public void sleep(int hour) {
}

05-5. 생성자 (Constructor)

메소드명 = 클래스명, 리턴값 없음
생성자 호출 시 문자열 전달

public class HouseDog extends Dog {
  public HouseDog (String name) {
    this.setName(name);
  }
  ...
  public static void main (String[] args) {
    HouseDog dog = new HouseDog("happy");
  }
}
