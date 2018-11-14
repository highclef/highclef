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
## Scanner
#### Scanner 클래스를 이용하면 콘솔입력을 보다 쉽게 처리할 수 있다.
```
package Console;
import java.util.Scanner;

public class ScannerTest {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.next());
	// next - 단어, nextLine - 줄, nextInt - 정수
    }
}
```
# 06-2. 파일 입출력
## FileOutputStream
#### 바이트 단위로 파일을 작성한다.
```
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite {
	public static void main(String[] args) throws IOException {
		FileOutputStream output = new FileOutputStream("c:/out.txt");
		for(int i=1; i<11; i++) {
			String data = i+" 번째 줄입니다.\r\n";
			// 유닉스인 경우는 \n 만 있으면 된다. 윈도우즈의 경우 \r\n 처럼 \r 문자를 추가해야 줄바꿈이 제대로 표시되어 보인다.
			output.write(data.getBytes());
			// FileOutputStream에 값을 쓸 때는 byte배열로 써야 함
		}
	output.close();
	}
}
```
## FileWriter
#### 문자열 단위로 파일을 작성한다.
```
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {
	FileWriter fw = new FileWriter("c:/out.txt");
        for(int i=1; i<11; i++) {
		String data = i+" 번째 줄입니다.\r\n";
		fw.write(data);
        }
        fw.close();
        
        FileWriter fw2 = new FileWriter("c:/out.txt", true);
        // 두번째 boolean 입력 파라미터는 파일을 추가모드(append)로 열것인지에 대한 구분값이다
        for(int i=11; i<21; i++) {
		String data = i+" 번째 줄입니다.\r\n";
		fw2.write(data);
        }
        fw2.close();
	}
}
```
## PrintWriter
#### 자동 줄바꿈 기능을 지원한다.
```
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class FileWrite {
	PrintWriter pw = new PrintWriter("c:/out.txt");
        for(int i=1; i<11; i++) {
		String data = i+" 번째 줄입니다.";
		pw.println(data);
        }
        pw.close();
        
        PrintWriter pw2 = new PrintWriter(new FileWriter("c:/out.txt", true));
        // PrintWriter의 생성자의 입력으로 파일명 대신 추가모드로 열린 FileWriter의 객체를 사용하면 된다.
        for(int i=11; i<21; i++) {
		String data = i+" 번째 줄입니다.";
		pw2.println(data);
        }
        pw2.close();
}
```
## FileInputStream
#### 바이트 단위로 파일을 읽는다.
```
import java.io.FileInputStream;
import java.io.IOException;

public class FileRead {
	public static void main(String[] args) throws IOException {
		byte[] b = new byte[1024];
        	FileInputStream input = new FileInputStream("c:/out.txt");
        	input.read(b);
        	System.out.println(new String(b));
        	input.close();
	}
}
```
## BufferedReader
#### 줄 단위로 파일을 읽는다.
```
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class FileRead {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("c:/out.txt"));
		while(true) {
		    String line = br.readLine();
		    if (line==null) break;
		    System.out.println(line);
		}
        	br.close();
	}
}
```
