import java.util.List;
import java.util.function.Predicate;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/18 15:19
 */
public class P47 {
    public static void main(String[] args) {
        List<P38> people = P38.people;
        //筛出21岁以上且姓氏为brown
        Predicate<P38> drinkingAge = (it) -> it.getAge() >= 21;
        Predicate<P38> brown = (it) -> it.getLastName().equals("Brown");
        people.stream()
                //使用and
                .filter(drinkingAge.and(brown))
                .forEach((it) ->
                        System.out.println("Have a beer, " +
                                it.getFirstName()));


    }
}
