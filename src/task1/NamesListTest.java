package task1;

import java.util.List;
import java.util.stream.Collectors;

public class NamesListTest {
    public static void main(String[] args) {
        List<String> namesList = TestNamesList
                .getNamesList()
                .stream()
                .limit(10)
                .collect(Collectors.toList());

        System.out.println("new NamesCustomList().getCustomListFrom(namesList) = " + new NamesList().getCustomListFrom(namesList));
    }
}
