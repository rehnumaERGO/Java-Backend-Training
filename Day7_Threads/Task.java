package Day7_Threads;

public class Task extends Thread {
    int number;

    public Task(int number) {
        this.number = number;
    }

    public void run() {
        System.out.print("Task" + number + " Started\n");

        for (int i = number * 100; i < number * 100 + 99; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\nTask" + number + " Done\n");
    }
}
