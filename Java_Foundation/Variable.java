/* This is variables is java */

public class Variable {
    public static void main(String[] args) throws Exception {

        // System.out.println("Hello, World!");

        // // Type "sout" for the print statement.
        // System.out.println("I used the sout shortcut");

        // // int
        // int age = 33;
        // System.out.println("Age: " + age);
        // int year = 2026;
        // System.out.println("year: " + year);

        // // double
        // double price = 19.22;
        // System.out.println("$" + price);

        // // char
        // char grade = 'A';
        // System.out.println("grade: " + grade);

        // // boolean
        // boolean isStudent = true;
        // System.out.println(isStudent);

        // if (isStudent) {
        // System.out.println("you are a student");
        // } else {
        // System.out.println("you are not a student");
        // }

        // string
        String name = "Nishimura Riki";
        String food = "Sushi";
        System.out.println(name + "'s favourite food is " + food);

        // string methods

        System.out.println(name.length());
        System.out.println(name.charAt(0));
        System.out.println(name.trim()); // removes the whitespace
        System.out.println(name.indexOf("i"));
        System.out.println(name.lastIndexOf("i"));
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.replace("i", "a"));
        System.out.println(name.substring(10, 14));
        if (name.contains(" ")) {
            System.out.println("Your name contains spaces");
        } else {
            System.out.println("Your name doesn't contain any spaces");
        }
        // equals() method is case sensitive and equalsIgnoreCase() is not case
        // sensitive
        if (name.equalsIgnoreCase("Password")) {
            System.out.println("Name can't be same as the password");
        } else {
            System.out.printf("Hello %s", name);
        }

    }
}
