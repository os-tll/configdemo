import java.util.List;
import java.util.stream.Stream;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/18 15:19
 */
public class P53 {
    public static void main(String[] args) {
        Stream lastNames = P38.people.stream() .map(P38::getLastName);
    }
}
