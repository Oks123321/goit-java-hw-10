package task2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SortedListTests {
    static String text = "Ann, Boris, Barbara, Peter, John, Mary, Alex, Max, Andrew, George, Lily, Samanta, Sam";
    static List<String> stringList = Arrays.asList(text.split(", "));

    public SortedListTests() throws FileNotFoundException {
    }

    public static void main(String[] args) {
        System.out.println("stringList = " + stringList);

        ListSorter listSorter = new ListSorter();
        System.out.println("listSorter.getSortedListFrom(stringList) = " + listSorter.getSortedListFrom(stringList));
    }
}
