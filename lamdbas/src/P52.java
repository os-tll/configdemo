import java.util.Arrays;
import java.util.List;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/18 15:19
 */
public class P52 {
    public static void main(String[] args) {
        List<P38> people = P38.people;
        int sum = people.stream()
                .mapToInt(P38::getAge)
                .reduce(Integer::sum).getAsInt();
        System.out.println("sum age: "+sum);

        double average = people.stream()
                .mapToInt(P38::getAge)
                .average().getAsDouble();
        System.out.println("average age: "+average);
    }
}
