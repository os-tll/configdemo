import java.util.stream.Stream;

/**
 * https://c.runoob.com/front-end/710
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/18 15:19
 */
public class P54 {
    public static void main(String[] args) {
        String xml =
                "<people data='lastname'>" +
                        P38.people.stream()
                                .map(it -> "<person>" + it.getLastName() + "</person>")
                                .reduce("", String::concat)
                        + "</people>";
        System.out.println(xml);

    }
}
