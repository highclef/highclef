package jump2java;


// Call by Value
/*
class Updater {
    public void update(int count) {
        count++;
    }
}
*/

// Call by Reference
class Updater {
    public void update(Counter counter) {
        counter.count++;
    }
}

public class Counter {	// Counter.java 내의 Counter라는 클래스는 public 으로 선언할 것
    int count = 0;  // 객체변수
    public static void main(String[] args) {
        Counter myCounter = new Counter();
        System.out.println("before update:"+myCounter.count);
        Updater myUpdater = new Updater();
        // myUpdater.update(myCounter.count);
        myUpdater.update(myCounter);
        System.out.println("after update:"+myCounter.count);
    }
}