package src.main.java.org.task.concept;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class AchieveThreads {

    public static void main(String[] args) throws InterruptedException {

        // THREAD CLASS
        MyThread thread1 = new MyThread();
        thread1.start();

        // RUNNABLE INTERFACE
        Thread thread2 = new Thread(new MyRunnable());
        thread2.start();

        // LAMBDA EXPRESSION
        Thread thread3 = new Thread(() -> System.out.println("THREAD 3 RUNNING BY LAMBDA EXPRESSION"));
        thread3.start();

        // EXECUTORS SERVICE
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(() -> System.out.println("TASK 1 RUNNING BY EXECUTORS"));
        executorService.execute(() -> System.out.println("TASK 2 RUNNING BY EXECUTORS"));
        executorService.shutdown();

        // COUNT BY SYNCHRONIZED
        Counter counter = new Counter();
        Runnable task = () -> {
            for (int i = 0; i < 100; i++) {
                counter.increment();
            }
        };

        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("COUNT: " + counter.getCount());

    }

}

class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("THREAD 1 RUNNING BY THREAD CLASS");
    }

}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("THREAD 2 RUNNING BY RUNNABLE INTERFACE");
    }

}

class Counter {

    private int count = 0;

    public synchronized void increment() {
        System.out.println("called by " + Thread.currentThread().getName());
        count++;
    }

    public int getCount() {
        return count;
    }

}