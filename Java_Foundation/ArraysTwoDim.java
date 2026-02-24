public class ArraysTwoDim {
    public static void main(String[] args) {
        // String fruits[] = { "Apple", "Mango", "Banana" };
        // String vegetables[] = { "Chilli", "Potato", "Onion" };
        // String meats[] = { "Chicken", "Mutton", "Shrimp" };

        // String[][] groceries = { fruits, vegetables, meats };
        // groceries[1][0] = "Cabbage";
        // for (String[] foods : groceries) {
        // for (String food : foods) {
        // System.out.print(food + " ");
        // }
        // System.out.println("");
        // }

        char[][] telephone = { { '1', '2', '3' }, { '4', '5', '6' }, { '7', '8', '9' }, { '*', '0', '#' } };
        for (char[] codes : telephone) {
            for (char code : codes) {
                System.out.print(code + " ");
            }
            System.out.println("");
        }
    }
}
