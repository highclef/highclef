package ConsoleInputOutput;

import java.io.BufferedReader;
import java.io.InputStream;	// java의 내장 클래스 중 java.lang 패키지에 속해있지 않은 클래스
import java.io.InputStreamReader;

public class StreamTest {
	public static void main(String[] args) throws Exception {
        /*
        // InputStream - byte
        InputStream in = System.in;
        byte[] a = new byte[3];
        in.read(a);

        for (int i=0;i<a.length;i++) {
        	System.out.println(a[i]);
        }
		
		// InputStreamReader - character
		InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        char[] a = new char[3];
        reader.read(a);

        System.out.println(a);
        */
		
        // BufferedReader - String
		InputStream in = System.in;
        InputStreamReader reader = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(reader);
        // BufferedReader는 객체 생성시 생성자의 입력값으로 InputStreamReader의 객체가 필요하다.

        String a = br.readLine();
        System.out.println(a);
    }
}
