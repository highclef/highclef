package exceptionTest;

public class Test {
	public void sayNick(String nick) throws FoolException {
	    if("fool".equals(nick)) {
	        throw new FoolException();
	    }
	    System.out.println("����� ������ "+nick+" �Դϴ�.");
	}

	public static void main(String[] args) {
	    Test test = new Test();
	    try {
	        test.sayNick("fool");
	        test.sayNick("genious");
	    }catch(FoolException e) {
	        System.err.println("FoolException�� �߻��߽��ϴ�.");
	    }
	}
}
