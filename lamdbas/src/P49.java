import java.util.List;
import java.util.stream.IntStream;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/18 15:19
 */
public class P49 {
    public static void main(String[] args) {
        List<P38> people = P38.people;
        IntStream ages =
                people.stream()
                        .mapToInt((it) -> it.getAge());
        for (int i : ages.toArray()) {
            System.out.println(i+"  ");
        }


    }
}
