import java.util.Arrays;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/9 17:12
 */
public class P26_1 {
    public static void main(String... args) {

        P26_2[] P26_2s = new P26_2[]{
                new P26_2("Ted", "Neward", 41),
                new P26_2("Charlotte", "Neward", 41),
        };
        Arrays.sort(P26_2s, (lhs, rhs) -> lhs.firstName.compareTo(rhs.firstName));

        for (P26_2 p : P26_2s) {
            System.out.println(p);
        }
    }

}
