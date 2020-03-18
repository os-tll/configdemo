import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/9 17:12
 */
public class P35 {
    public static void main(String... args) {
        List<P34> people = P34.people;

        Collections.sort(people, new Comparator<P34>() {
            @Override
            public int compare(P34 lhs, P34 rhs) {
                if (lhs.getLastName().equals(rhs.getLastName())) {
                    return lhs.getAge() - rhs.getAge();
                } else {
                    return lhs.getLastName().compareTo(rhs.getLastName());
                }
            }
        });


        Collections.sort(people, (lhs, rhs) -> {
            if (lhs.getLastName().equals(rhs.getLastName())) {
                return lhs.getAge() - rhs.getAge();
            } else {
                return lhs.getLastName().compareTo(rhs.getLastName());
            }
        });
    }

}

