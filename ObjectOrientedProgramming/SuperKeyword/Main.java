package SuperKeyword;

/*
super = Refers to the parent class.
Used in constructors and method overriding.
Calls the parent constructor to initialize attributes.
*/
public class Main {
    public static void main(String[] args) {
        Person person = new Person("Tom", "Riddle");
        person.showName();
        System.out.println(" ");

        Student student = new Student("Harry", "Potter", 3.4);
        student.showName();
        // System.out.println(student.gpa);
        student.showGpa();

        System.out.println(" ");
        Employee employee = new Employee("Rubeus", "Hagrid", 12000);
        employee.showName();
        employee.showSalary();
    }
}
