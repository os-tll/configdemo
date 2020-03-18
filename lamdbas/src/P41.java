import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/9 17:12
 */
public class P41 {
    public static void main(String... args) {
        List<P38> p38s = P38.people;
        //先按LastName，再按FirstName
        Collections.sort(p38s,
                Comparator.comparing(P38::getLastName)
                        .thenComparing(P38::getFirstName));
        System.out.println(p38s);
    }

}

