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

public class Counter {	// Counter.java ���� Counter��� Ŭ������ public ���� ������ ��
    int count = 0;  // ��ü����
    public static void main(String[] args) {
        Counter myCounter = new Counter();
        System.out.println("before update:"+myCounter.count);
        Updater myUpdater = new Updater();
        // myUpdater.update(myCounter.count);
        myUpdater.update(myCounter);
        System.out.println("after update:"+myCounter.count);
    }
}