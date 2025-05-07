package lr6;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Example5 {
    private static int max = Integer.MIN_VALUE;
    private static final Lock lock = new ReentrantLock();

    public static int findMax(int[] array) throws InterruptedException {
        int cores = Runtime.getRuntime().availableProcessors();
        Thread[] threads = new Thread[cores];
        int chunkSize = array.length / cores;

        for (int i = 0; i < cores; i++) {
            final int start = i * chunkSize;
            final int end = (i == cores - 1) ? array.length : start + chunkSize;

            threads[i] = new Thread(() -> {
                int localMax = Integer.MIN_VALUE;
                for (int j = start; j < end; j++) {
                    if (array[j] > localMax) {
                        localMax = array[j];
                    }
                }

                lock.lock();
                try {
                    if (localMax > max) {
                        max = localMax;
                    }
                } finally {
                    lock.unlock();
                }
            });
            threads[i].start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        return max;
    }

    public static void main(String[] args) throws InterruptedException {
        int[] array = {3, 7, 2, 9, 1, 4, 6, 8, 5};
        System.out.println("Max element: " + findMax(array));
    }
}
