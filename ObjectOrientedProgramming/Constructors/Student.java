package Constructors;

public class Student {
    String name;
    int age;
    double cgpa;
    boolean isEnrolled;

    // Constructor = A special method to initialize objects.
    // You can pass arguments to a constructor and set up initial values.
    Student(String name, int age, double cgpa) {
        this.name = name;
        this.age = age;
        this.cgpa = cgpa;
        this.isEnrolled = true;

        /*
         * 'this' refers to the object we are currently working with.
         * Means when I'm working with object student1, it will do :
         * student1.name = name;
         * student1.age = age;
         * student1.cgpa = cgpa;
         * and same with the other objects too like for student2 it will do the same:
         * student2.name = name;
         * student2.age = age;
         * student2.cgpa = cgpa;
         */
    }

    void study() {
        System.out.println(this.name + " is studying");
    }
}
