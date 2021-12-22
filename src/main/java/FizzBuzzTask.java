import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzTask {
    public static List<String> fizzBuzzIt(int n) {
        return IntStream.range(1, n + 1).mapToObj(x ->{
            if (x % 3 == 0){
                return "Fizz";
            } if (x % 5 == 0) {
                return "Buzz";
            } else{
                return String.valueOf(x);
            }
        }).collect(Collectors.toList());
    }
}
