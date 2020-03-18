import java.util.Comparator;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/9 16:00
 */
public class P14 {
    public static void main(String... args) {

        Comparator<String> c =
                (String lhs, String rhs) -> lhs.compareTo(rhs);

        int result = c.compare("Hello", "World");
    }

}
