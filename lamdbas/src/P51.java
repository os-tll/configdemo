import java.util.Arrays;
import java.util.List;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/18 15:19
 */
public class P51 {
    public static void main(String[] args) {
        List<P38> people = P38.people;
        int sum1 = people.stream()
                .mapToInt(P38::getAge)
                .reduce(0, (l, r) -> l + r);
        System.out.println("sum age: "+sum1);

        List<Integer> values = Arrays.asList(1, 2, 3, 4, 5);
        int sum2 = values.stream().reduce(0, (l,r) -> l+r);
        System.out.println("sum values:  "+sum2);

    }
}
