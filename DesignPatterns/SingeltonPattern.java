package DesignPatterns;

class SingletonExample {
    private static SingletonExample singletonExample;

    private SingletonExample() {
    }

    // public static synchronized SingletonExample getInstance() {
    //     if (singletonExample == null) {
    //         try {
    //             Thread.sleep(10000); 
    //         } catch (InterruptedException e) {
    //             e.printStackTrace();
    //         }
            
    //         singletonExample = new SingletonExample();
    //     }
    //     return singletonExample;
    // }
    public static SingletonExample getInstance() {
        if (singletonExample == null) {
            synchronized (SingletonExample.class) {
                if (singletonExample == null) {
                    singletonExample = new SingletonExample();
                }
            }
        }
            return singletonExample;

    }
}

public class SingeltonPattern {

    public static void main(String[] args) {
        final int numThreads = 10;
        Thread[] threads = new Thread[numThreads];

        for (int i = 0; i < numThreads; i++) {
            threads[i] = new Thread(() -> {
                SingletonExample instance = SingletonExample.getInstance();
                System.out.println("Thread " + Thread.currentThread().getId() + " - Instance hash code: " + instance.hashCode());
            });
        }

        for (Thread thread : threads) {
            thread.start();
        }

        // Wait for all threads to finish (optional if you want to see the output)
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
