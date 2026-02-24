package Aggregation;

/*
Aggregation = Represents a 'has-a' relationship between objects.
One object contains another object as part of its structure.
But the contained object/s can exist independently.
*/
public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The Midnight Library", 300);
        Book book2 = new Book("The trial", 200);
        Book book3 = new Book("The Alchemist", 240);

        Book[] books = { book1, book2, book3 };

        Library library = new Library("Asiatic Library Mumbai", 1804, books);
        library.displayInfo();
    }
}
