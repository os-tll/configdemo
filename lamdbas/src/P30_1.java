import java.util.Arrays;
import java.util.Comparator;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/9 17:12
 */
public class P30_1 {
    public static void main(String... args) {

        P30_2[] P30_2s = new P30_2[]{
                new P30_2("Ted", "Neward", 41),
                new P30_2("Charlotte", "Neward", 41),
        };
        Comparator<P30_2> cf = P30_2::compareFirstNames;
        Arrays.sort(P30_2s, cf);

        for (P30_2 p : P30_2s) {
            System.out.println(p);
        }
    }

}
