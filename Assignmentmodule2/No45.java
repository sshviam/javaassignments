package Assignmentmodule2;

class MyThread extends Thread {
    @Override
    public void run() {
        try {
            System.out.println("Thread " + Thread.currentThread().getId() + " is starting.");
            Thread.sleep(2000);
            System.out.println("Thread " + Thread.currentThread().getId() + " has completed.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class No45 {
    public static void main(String[] args) {
        MyThread thread1 = new MyThread();
        MyThread thread2 = new MyThread();

        thread1.start();
        thread2.start();
    }
}

