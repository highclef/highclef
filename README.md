# 05-3. Call by Value

#### class 이름이 파일명과 동일할 경우, public으로 선언할 것.

<Counter.java>
```
class Update {
}
public class Counter { 
}
```
# 05-4. 상속
```
자식클래스 extends 부모클래스
부모클래스 A = new 자식클래스();
```
#### 자바에서 만드는 모든 객체는 object형으로 사용할 수 있다.
```
Object B = new 클래스이름();
```
#### Method overloading: 메소드의 입력 파라미터가 다를 경우 가능.
```
public void sleep() {
}
public void sleep(int hour) {
}
```
# 05-5. 생성자 (Constructor)

#### 메소드명 = 클래스명, 리턴값 없음
#### 생성자 호출 시 문자열 전달
```
public class HouseDog extends Dog {
	public HouseDog (String name) {
		this.setName(name);
	}
  ...
	public static void main (String[] args) {
		HouseDog dog = new HouseDog("happy");
	}
}
```
# 06-1. 콘솔 입출력

## InputStream
#### 바이트 단위로 데이터를 입력받아 출력한다.
```
import java.io.InputStream;

public class StreamTest {
	public static void main(String[] args) throws Exception {
		InputStream in = System.in;
		byte[] a = new byte[3];
		in.read(a);

		for (int i=0;i<a.length;i++) {
		System.out.println(a[i]);
		}
	}
}
```
## InputStreamReader
#### 문자를 입력받아 출력한다.
```
import java.io.InputStreamReader;

public class StreamTest {
	public static void main(String[] args) throws Exception {
		InputStreamReader reader = new InputStreamReader(in);
		char[] a = new char[3];
		reader.read(a);

		System.out.println(a);
	}
}
```
## BufferedReader
#### 문자열을 입력받아 출력한다.
```
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class StreamTest {
	public static void main(String[] args) throws Exception {
		InputStream in = System.in;
		InputStreamReader reader = new InputStreamReader(in);
		BufferedReader br = new BufferedReader(reader);
		// BufferedReader는 객체 생성시 생성자의 입력값으로 InputStreamReader의 객체가 필요하다.

		String a = br.readLine();
		System.out.println(a);
	}
}
```
