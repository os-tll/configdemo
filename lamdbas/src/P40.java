import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/9 17:12
 */
public class P40 {
    public static void main(String... args) {
        List<P38> p38s = P38.people;
        //sort()方法直接在列表中。这是关于接口默认方法介绍的一个好处:
        // 以前我们必须将这种基于非继承的可重用行为放在静态方法中，现在可以将它提升到接口中。

        //先按LastName,再按Age
        Collections.sort(p38s, P38.BY_LAST.thenComparing(P38.BY_AGE));

        Collections.sort(p38s,
                Comparator.comparing(P38::getLastName)
                        .thenComparing(P38::getAge));
    }

}

