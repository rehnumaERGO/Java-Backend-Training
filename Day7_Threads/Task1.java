package Day7_Threads;

// Task2
public class Task1 extends Thread {
    public void run() {
        System.out.println("Task2 Starts");
        for (int i = 100; i < 131; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nTask2 completed\n");
    }
}
