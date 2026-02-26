package Day7_Threads;

// Task2
public class Task2 implements Runnable {
    public void run() {
        System.out.println("Task2 Starts");
        for (int i = 200; i < 231; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nTask2 completed\n");
    }
}
