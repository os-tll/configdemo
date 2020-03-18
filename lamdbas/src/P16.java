import java.util.Comparator;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/9 16:13
 */
public class P16 {
    public static void main(String[] args) {
        Comparator<String> c1 = (String lhs, String rhs) -> lhs.compareTo(rhs);
        Comparator<String> c2 = (lhs, rhs) -> lhs.compareTo(rhs);
    }
}
