package Assignmentmodule2;

class TestThreadTwice1 extends Thread {
    @Override
    public void run() {
        System.out.println("Thread " + Thread.currentThread().getId() + " is running.");
    }
}

public class No46 {
    public static void main(String[] args) {
        TestThreadTwice1 t1 = new TestThreadTwice1();
        t1.start();  // First start
        t1.start();  // Attempted second start (will throw IllegalThreadStateException)
    }
}

