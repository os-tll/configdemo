/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/18 15:19
 */
public class P55 {
    public static void main(String[] args) {
        String json =
                P38.people.stream()
                        .map(P38::toJSON)
                        .reduce("[", (l, r) -> l + (l.equals("[") ? "" : ",") + r)
                        + "]";
        System.out.println(json);


    }
}
