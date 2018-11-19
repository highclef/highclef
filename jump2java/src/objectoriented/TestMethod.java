package objectoriented;

public class TestMethod {
	public int sum(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        int a = 3;
        int b = 4;

        TestMethod myTest = new TestMethod();
        int c = myTest.sum(a, b);

        System.out.println(c);
    }
}
