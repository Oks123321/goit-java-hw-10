package task2;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ListSorter implements SortListInterface {

    @Override
    public List<String> getSortedListFrom(List<String> stringsList) {
        return stringsList
                .stream()
                .map(s -> s.toUpperCase())
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
    }
}
