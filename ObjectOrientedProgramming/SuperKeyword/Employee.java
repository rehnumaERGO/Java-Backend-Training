package SuperKeyword;

public class Employee extends Person {
    int salary;

    Employee(String first, String last, int salary) {
        super(first, last);
        this.salary = salary;
    }

    void showSalary() {
        System.out.println(this.first + "'s salary is $" + this.salary);
    }

    @Override
    void showName() {
        System.out.println("The name is " + this.first + " " + this.last);
    }
}
