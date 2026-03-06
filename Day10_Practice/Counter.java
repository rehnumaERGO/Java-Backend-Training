package Day10_Practice;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;

// Shared counter class to demonstrate concurrency issues
class Counter {
    int count = 0; // Normal variable (unsafe)
    int syncCount = 0; // Synchronized variable
    AtomicInteger atomicCount = new AtomicInteger(0); // Atomic variable
    ReentrantLock lock = new ReentrantLock(); // Lock object

    // Increment without synchronization (may cause race conditions)
    public void unsafeIncrement() {
        count++;
    }

    // Increment using synchronized method (thread-safe)
    public synchronized void synchronizedIncrement() {
        syncCount++;
    }

    // Increment using ReentrantLock (thread-safe)
    public void lockIncrement() {
        lock.lock();
        try {
            syncCount++; // can also increment separate variable
        } finally {
            lock.unlock();
        }
    }

    // Increment using AtomicInteger (lock-free, thread-safe)
    public void atomicIncrement() {
        atomicCount.incrementAndGet();
    }
}