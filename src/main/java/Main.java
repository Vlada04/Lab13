import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        GroupWordsTask m = new GroupWordsTask();
        List<String> s = Arrays.asList("ABCA", "BCD", "ABC");
        System.out.println(m.groupIt(s));
    }
}