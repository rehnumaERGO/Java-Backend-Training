package Static_Keywords;

public class Main {
    public static void main(String[] args) {
        Friend friend1 = new Friend("Dora");
        Friend friend2 = new Friend("Diego");
        Friend friend3 = new Friend("Park");
        Friend friend4 = new Friend("Sandy");

        System.out.println("friend1 = " + friend1.name);
        // System.out.println(friend1.numOfFriends);
        // System.out.println(" ");
        System.out.println("friend2 = " + friend2.name);
        // System.out.println(friend2.numOfFriends);
        // System.out.println(" ");
        System.out.println("friend3 = " + friend3.name);
        // System.out.println(friend3.numOfFriends);
        // System.out.println(" ");
        System.out.println("friend4 = " + friend4.name);
        // System.out.println(friend4.numOfFriends);
        System.out.println("Total no. of friends = " + Friend.numOfFriends);
        System.out.println(" ");
        Friend.showFriends();
        /*
         * We don't do the below thing because round() is a static methods, it behaves
         * as a utility method.
         * we can access it through the class name, no need to create any object for it.
         */
        // Math math1 = new Math();
        // math1.round(3.99);

        System.out.println(Math.round(3.59));

    }
}
