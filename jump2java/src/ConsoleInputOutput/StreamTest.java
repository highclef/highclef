package ConsoleInputOutput;

import java.io.BufferedReader;
import java.io.InputStream;	// java�� ���� Ŭ���� �� java.lang ��Ű���� �������� ���� Ŭ����
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
        // BufferedReader�� ��ü ������ �������� �Է°����� InputStreamReader�� ��ü�� �ʿ��ϴ�.

        String a = br.readLine();
        System.out.println(a);
    }
}
