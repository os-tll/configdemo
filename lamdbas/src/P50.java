import java.util.List;
import java.util.stream.IntStream;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/18 15:19
 */
public class P50 {
    public static void main(String[] args) {
        List<P38> people = P38.people;
        int sum = people.stream()
                .mapToInt(P38::getAge)
                .sum();

        System.out.println(sum);

    }
}
