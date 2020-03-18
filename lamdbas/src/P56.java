import java.util.stream.Collectors;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/18 15:19
 */
public class P56 {
    public static void main(String[] args) {
        String joined = P38.people.stream()
                .map(P38::toJSON)
                .collect(Collectors.joining(", "));
        System.out.println("[" + joined + "]");

        String json = P38.people.stream()
                .sorted(P38.BY_LAST)
                .map(P38::toJSON)
                .collect(Collectors.joining(",",  "[", "]"));
        System.out.println(json);

    }
}
