import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CountBinaryBitFromInt {
    public static void main(String[] args) {
        int i = 8;
        System.out.println(Integer.toBinaryString(i));
        String binaryString = Integer.toBinaryString(i);
        System.out.println(binaryString);
        String[] str = binaryString.split("");
        System.out.println(Arrays.toString(str));
        List<String> ls = Arrays.asList(str);
        long l = ls.stream().map(s -> s + "").filter(m -> m.startsWith("1")).count();
        System.out.println(l);
    }
}
