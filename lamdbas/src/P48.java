import java.util.List;
import java.util.function.Predicate;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/18 15:19
 */
public class P48 {
    public static void main(String[] args) {
        List<P38> people = P38.people;
        people.stream()
                .filter((it) -> it.getAge() >= 21)
                .forEach((it) ->
                        System.out.println("Have a beer, " + it.getFirstName()));



    }
}
