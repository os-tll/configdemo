import java.util.stream.Collectors;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/18 15:19
 */
public class P57{
    public static void main(String[] args) {
        P38.people.parallelStream()
                .filter((it) -> it.getAge() >= 21)
                .forEach((it) ->
                        System.out.println("1Have a beer: " + it.getFirstName() +" Thread: "+
                                Thread.currentThread()));

        P38.people.parallelStream().sequential()
                .filter((it) -> it.getAge() >= 21)
                .forEach((it) ->
                        System.out.println("2Have a beer: " + it.getFirstName() +" Thread: "+
                                Thread.currentThread()));
    }
}
