package File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class FileWrite {
    public static void main(String[] args) throws IOException {
    	/*
    	// FileOutputStream - ����Ʈ ������ �����͸� ó����
        FileOutputStream output = new FileOutputStream("c:/out.txt");
        for(int i=1; i<11; i++) {
            String data = i+" ��° ���Դϴ�.\r\n";
			// (�� ���н��� ���� \n �� ������ �ȴ�. ���������� ��� \r\n ó�� \r ���ڸ� �߰��ؾ� ��Ʈ�е� ���� �����Ϳ��� �ٹٲ��� ����� ǥ�õǾ� ���δ�.)
            output.write(data.getBytes());
            // FileOutputStream�� ���� �� ���� byte�迭�� ��� ��
        }
        output.close();
        */
    	
    	// FileWriter - ���ڿ��� ���� ���Ͽ� �� �� �ִ�
        FileWriter fw = new FileWriter("c:/out.txt");
        for(int i=1; i<11; i++) {
            String data = i+" ��° ���Դϴ�.\r\n";
            fw.write(data);
        }
        fw.close();
        
        FileWriter fw2 = new FileWriter("c:/out.txt", true);
        // �ι�° boolean �Է� �Ķ���ʹ� ������ �߰����(append)�� ���������� ���� ���а��̴�
        for(int i=11; i<21; i++) {
            String data = i+" ��° ���Դϴ�.\r\n";
            fw2.write(data);
        }
        fw2.close();
        
    	/*
    	// PrintWriter - �ڵ� �ٹٲ�
        PrintWriter pw = new PrintWriter("c:/out.txt");
        for(int i=1; i<11; i++) {
            String data = i+" ��° ���Դϴ�.";
            pw.println(data);
        }
        pw.close();
        
        PrintWriter pw2 = new PrintWriter(new FileWriter("c:/out.txt", true));
        // PrintWriter�� �������� �Է����� ���ϸ� ��� �߰����� ���� FileWriter�� ��ü�� ����ϸ� �ȴ�.
        for(int i=11; i<21; i++) {
            String data = i+" ��° ���Դϴ�.";
            pw2.println(data);
        }
        pw2.close();
        */
    }
}