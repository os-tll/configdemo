import java.util.List;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/18 15:19
 */
public class P42 {
    public static void main(String[] args) {
        List<P38> people = P38.people;
        people.forEach((it) -> System.out.println("Person: " + it));

    }
}
