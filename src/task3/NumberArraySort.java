package task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberArraySort implements NumberArraySortInterface {
    @Override
    public String getSortedListFrom(String[] stringsArray) {
        List<String> list = new ArrayList<>(Arrays.asList(stringsArray));

        List<Integer> listOfIntegers = new ArrayList<>();

        list.forEach(s -> {
                    String[] numbers = s.split(", ");

                    Arrays
                            .stream(numbers)
                            .forEach(n -> listOfIntegers.add(Integer.valueOf(n)));
                });

        return listOfIntegers
                .stream()
                .sorted()
                .map(integer -> integer.toString())
                .collect(Collectors.joining(", "));
    }
}
