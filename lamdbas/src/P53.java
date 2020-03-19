import java.util.stream.Stream;

/**
 * https://c.runoob.com/front-end/710
 *
 *  * <people data='lastname'>
 *  *     <person>Neward</person>
 *  *     <person>Neward</person>
 *  *     <person>Neward</person>
 *  *     <person>Ford</person>
 *  *     <person>Brown</person>
 *  *     <person>Brown</person>
 *  * </people>
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/18 15:19
 */
public class P53 {
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
