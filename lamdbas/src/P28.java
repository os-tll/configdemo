import java.util.Arrays;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/9 17:12
 */
public class P28 {
    public static void main(String... args) {

        P27[] p27s = new P27[]{
                new P27("Ted", "Neward", 41),
                new P27("Charlotte", "Neward", 41),
        };
        Arrays.sort(p27s, P27.compareFirstName);

        for (P27 p : p27s) {
            System.out.println(p);
        }
    }

}
