package File;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileInputStream;
import java.io.IOException;

public class FileRead {
    public static void main(String[] args) throws IOException {
        /*
        // FileInputStream - 파일을 바이트 단위로 읽음
    	byte[] b = new byte[1024];
        FileInputStream input = new FileInputStream("c:/out.txt");
        input.read(b);
        System.out.println(new String(b));
        input.close();
        */
    	
    	// FileReader + BufferedReader - 라인 단위로 파일을 읽음
        BufferedReader br = new BufferedReader(new FileReader("c:/out.txt"));
        while(true) {
            String line = br.readLine();
            if (line==null) break;
            System.out.println(line);
        }
        br.close();
    }
}