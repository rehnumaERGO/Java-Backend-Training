package Day10_Practice;

// Task using Runnable interface
class MyTask implements Runnable {
    Counter counter;

    MyTask(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            counter.unsafeIncrement(); // Unsafe
            counter.synchronizedIncrement(); // Safe with synchronized
            counter.lockIncrement(); // Safe with lock
            counter.atomicIncrement(); // Safe with atomic
        }
    }
}