import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MaxOccuredElementFromStreamn {
    public static void main(String[] args) {

        Stream.of(1, 3, 4, 3, 4, 3, 2, 3, 3, 3, 3, 3)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(System.out::println);


        Stream.of('A','A', '3', 'A', 'B', '3')
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(System.out::println);


        List<Integer> ls = Arrays.asList(1,2,3,4,5,6,7,7,1,1);
        System.out.println("ls: " +ls);

        Integer res = ls.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                 .entrySet()
                 .stream()
                 .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .get();

        System.out.println(res);

    }
}
