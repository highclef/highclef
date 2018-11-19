package staticTest;

public class Counter  {
    static int count = 0;
    Counter() {
        this.count++;
    }

    public static int getCount() {
        return count;	// 그냥 int count가 아닌 static int count이기 때문에 static method 안에서 접근이 가능.
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();

        System.out.println(Counter.getCount());
    }
}
