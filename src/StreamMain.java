import java.util.stream.Stream;
import java.util.*;

public class StreamMain {
    public void printIntList(List<Integer> integerList) {
        integerList.stream()
                .filter(x -> x >= 0)
                .filter(x -> x % 2 == 0)
                .sorted(Comparator.naturalOrder())
                .forEach(r -> System.out.print(r + " "));
    }

}
