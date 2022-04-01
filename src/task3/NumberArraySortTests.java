package task3;

public class NumberArraySortTests {
    static String[] numberStrings = {"1, 2, 0", "4, 5"};

    public static void main(String[] args) {
        NumberArraySort listSorter = new NumberArraySort();
        System.out.println("listSorter.getSortedListFrom(numericStrings) = " + listSorter.getSortedListFrom(numberStrings));
    }
}
