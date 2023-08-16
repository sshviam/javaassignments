package Assignmentmodule2;

class TestDaemonThread2 extends Thread {
    @Override
    public void run() {
        if (Thread.currentThread().isDaemon()) {
            System.out.println("Daemon thread " + Thread.currentThread().getId() + " is running.");
        } else {
            System.out.println("User thread " + Thread.currentThread().getId() + " is running.");
        }
    }
}

public class No47 {
    public static void main(String[] args) {
        TestDaemonThread2 t1 = new TestDaemonThread2();
        TestDaemonThread2 t2 = new TestDaemonThread2();

        t1.setDaemon(true); // Setting t1 as a daemon thread

        t1.start();
        t2.start();
    }
}

