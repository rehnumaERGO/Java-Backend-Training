package Day7_Threads;

public class ThreadsBasicsRunner {
    public static void main(String[] args) throws InterruptedException {
        // Task1
        System.out.println("TASK1 Kicked Off");
        Task1 task1 = new Task1();
        task1.start();
        task1.setPriority(10);

        System.out.println("TASK2 Kicked Off");
        Task2 task2 = new Task2();
        Thread task2thread = new Thread(task2);
        task2thread.start();

        // System.out.println(" ");
        // Task3
        task1.join();
        task2thread.join();
        System.out.println("TASK3 Kicked Off");
        System.out.println("Task3 Starts");
        for (int i = 300; i < 331; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\nTask3 completed");
        System.out.println("\nMain Completed");
    }
}
