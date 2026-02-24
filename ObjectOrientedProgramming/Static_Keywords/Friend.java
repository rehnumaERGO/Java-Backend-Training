package Static_Keywords;

/*
static keyword = makes a variable or method belong to the class rather than to a specific object.
Commonly used for utility methods or shared resources.
Classes can't be static if they are the top level of hierarchy, only the nested classes can be static.
*/
public class Friend {
    String name;
    // int numOfFriends;

    // this variable is owned by the class not by the objects but all the objects
    // have access to it.
    static int numOfFriends;

    Friend(String name) {
        this.name = name;
        numOfFriends++;
    }

    static void showFriends() {
        // when we are working with a static attribute we don't need the
        // 'this' keyword to access it like(this.numOfFriends).
        System.out.println("You have " + numOfFriends + " total friends");
    }
}
