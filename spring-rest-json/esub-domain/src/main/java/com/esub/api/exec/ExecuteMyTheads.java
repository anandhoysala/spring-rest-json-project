package com.esub.api.exec;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecuteMyTheads {
	private static final int NTHREDS = 10;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(NTHREDS);
        for (int i = 0; i < 500; i++) {
            Runnable worker = new MyRunnable(10000000L + i);
            executor.execute(worker);
        }
        // This will make the executor accept no new threads
        // and finish all existing threads in the queue
        executor.shutdown();
        // Wait until all threads are finish
        executor.awaitTermination(1000, null);
        System.out.println("Finished all threads");
    }
}