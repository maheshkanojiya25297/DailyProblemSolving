import java.util.*;
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


        Stream.of('A', 'A', '3', 'A', 'B', '3')
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .ifPresent(System.out::println);


        List<Integer> ls = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 7, 1, 1);
        System.out.println("ls: " + ls);

        Integer res = ls.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .get();

        System.out.println(res);

        System.out.println("--------------------------------------------------------------------------------------------------------------------------");

        Stream.of('A', 'B', 'C', 'A', 'B')
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .ifPresent(System.out::println);


        System.out.println("--------------------------------------------------------------------------------------------------------------------------");

        String str = "MAHESH";
        //char[] charStr = str.toCharArray();
        // ..List<char[]> newls = Arrays.asList(charStr);
        Character result = str
                .chars()
                .mapToObj(s -> Character.toLowerCase(Character.valueOf((char) s)))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(Map.Entry.comparingByValue()).
                map(Map.Entry::getKey)
                .get();

        System.out.println(result);


        Character out = str.chars().mapToObj(c -> Character.toLowerCase(Character.valueOf((char) c)))
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entrt -> entrt.getValue() > 1L)
                .map(entry -> entry.getKey())
                .findFirst().get();

        System.out.println(out);


        System.out.println("--------------------------------------------------------------------------------------------------------------------------");


        Stream.of('M', 'A', 'H', 'E', 'S', 'H').collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1L)
                .map(Map.Entry::getKey)
                .findFirst()
                .ifPresent(System.out::println);

        System.out.println("--------------------------------------------------------------------------------------------------------------------------");

        HashMap<String, Integer> hm = new HashMap<>();
        hm.put("Mahesh1", 1);
        hm.put("Mahesh1", 1);
        hm.put("Mahesh3", 3);
        hm.put("Mahesh2", 2);
        System.out.println(hm);

        Set<Map.Entry<String, Integer>> entries = hm.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println("Key:" + entry.getKey() + " value:" + entry.getValue());
        }

        Iterator<Map.Entry<String, Integer>> itr = hm.entrySet().iterator();
        while (itr.hasNext()) {
            Map.Entry<String, Integer> entry = itr.next();
            System.out.println("itr key:" + entry.getKey());
            System.out.println("itr value:" + entry.getValue());
        }


    }


}
