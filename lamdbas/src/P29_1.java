import java.util.Arrays;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/9 17:12
 */
public class P29_1 {
    public static void main(String... args) {

        P29_2[] P29_2s = new P29_2[]{
                new P29_2("Ted", "Neward", 41),
                new P29_2("Charlotte", "Neward", 41),
        };
        Arrays.sort(P29_2s, P29_2::compareFirstNames);

        for (P29_2 p : P29_2s) {
            System.out.println(p);
        }
    }

}
