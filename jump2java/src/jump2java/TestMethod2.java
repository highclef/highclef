package jump2java;

public class TestMethod2 {
	int a;  // °´Ã¼º¯¼ö a

    public void vartest() {
        this.a++;
    }

    public static void main(String[] args) {
        TestMethod2 myTest = new TestMethod2();
        myTest.a = 1;
        myTest.vartest();
        System.out.println(myTest.a);
    }
}
