import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's start the quiz");
        System.out.println("---------------------");

        // Questions
        String[] questions = { "What is the scientific representation of gold? ",
                "What is the SI unit of temperature? ", "What is the capital of Nepal? ",
                "Which is the oldest programming language? " };

        int[] answers = { 0, 0, 2, 3 };

        int numQuestion = questions.length;

        // Options
        String[][] Options = { { "Au", "Mg", "Ag", "Cu" }, { "Kelvin", "Fahrenheit", "Celsius", "Rankine" },
                { "New Delhi", "Thimphu", "Kathmandu", "Naypyidaw" }, { "COBOL", "C", "BASIC", "Fortran" } };

        int total = 0;
        for (int i = 0; i < questions.length; i++) {
            System.out.printf("%d) ", i + 1);
            System.out.println(questions[i]);

            for (int j = 0; j < Options.length; j++) {
                System.out.printf("%d. ", j + 1);
                System.out.println(Options[i][j]);
            }
            System.out.print("Answer: ");
            int answer = scanner.nextInt();

            if (answer == answers[i] + 1) {
                System.out.println("Correct!");
                total++;
                System.out.println("---------------------");
            } else {
                System.out.println("Incorrect option");
                System.out.println("---------------------");
            }
        }
        System.out.println("Your correct answers are " + total + " out of 4");
    }
}
