package File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite {
    public static void main(String[] args) throws IOException {
        FileOutputStream output = new FileOutputStream("c:/out.txt");
        for(int i=1; i<11; i++) {
            String data = i+" ��° ���Դϴ�.\r\n";
            // (�� ���н��� ���� \n �� ������ �ȴ�. ���������� ��� \r\n ó�� \r ���ڸ� �߰��ؾ� ��Ʈ�е� ���� �����Ϳ��� �ٹٲ��� ����� ǥ�õǾ� ���δ�.)
            output.write(data.getBytes());
            // FileOutputStream�� ���� �� ���� byte�迭�� ��� ��
        }
        output.close();
    }
}