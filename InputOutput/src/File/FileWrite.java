package File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) throws IOException {
        FileOutputStream output = new FileOutputStream("c:/out.txt");
        for(int i=1; i<11; i++) {
            String data = i+" 번째 줄입니다.\r\n";
            // (※ 유닉스인 경우는 \n 만 있으면 된다. 윈도우즈의 경우 \r\n 처럼 \r 문자를 추가해야 노트패드 같은 에디터에서 줄바꿈이 제대로 표시되어 보인다.)
            output.write(data.getBytes());
            // FileOutputStream에 값을 쓸 때는 byte배열로 써야 함
        }
        output.close();
    }
}