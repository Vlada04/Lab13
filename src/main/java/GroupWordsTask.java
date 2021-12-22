import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GroupWordsTask {

    public static Map<Character, Long> groupIt(List<String> arr){
        Map<Character, Long> map = arr.stream().
                collect(Collectors.groupingBy(x -> x.charAt(0), HashMap::new, Collectors.toList())).
                entrySet().stream().collect(Collectors.toMap(x -> x.getKey(), y -> y.getValue().
                stream().flatMap(str -> Arrays.stream(str.split(""))).
                filter(ch -> ch.equals(y.getKey().toString())).count()));
        return map;
    }
}