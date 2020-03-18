import java.util.Comparator;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/9 16:08
 */
public class P15 {
    public static void main(String... args) {

        Comparator<String> c = (String lhs, String rhs) ->
        {
            try {
                System.out.println("I am comparing " + lhs + " to " + rhs);
                // break;   compile error

                //必须返回String或者其子类
                return lhs.compareTo(rhs);
            } catch (Exception e) {
                throw e;
            }
        };
        int result = c.compare("Hello", "World");
    }
}
