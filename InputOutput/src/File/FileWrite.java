package File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileWrite {
    public static void main(String[] args) throws IOException {
    	/*
    	 * 
    	// FileOutputStream - 바이트 단위로 데이터를 처리함
        FileOutputStream output = new FileOutputStream("c:/out.txt");
        for(int i=1; i<11; i++) {
            String data = i+" 번째 줄입니다.\r\n";
            // (※ 유닉스인 경우는 \n 만 있으면 된다. 윈도우즈의 경우 \r\n 처럼 \r 문자를 추가해야 노트패드 같은 에디터에서 줄바꿈이 제대로 표시되어 보인다.)
            output.write(data.getBytes());
            // FileOutputStream에 값을 쓸 때는 byte배열로 써야 함
        }
        output.close();
        
    	// FileWriter - 문자열을 직접 파일에 쓸 수 있다
        FileWriter fw = new FileWriter("c:/out.txt");
        for(int i=1; i<11; i++) {
            String data = i+" 번째 줄입니다.\r\n";
            fw.write(data);
        }
        fw.close();
        */
    	
    	// PrintWriter - 자동 줄바꿈
        PrintWriter pw = new PrintWriter("c:/out.txt");
        for(int i=1; i<11; i++) {
            String data = i+" 번째 줄입니다.";
            pw.println(data);
        }
        pw.close();
    }
}