import java.util.ArrayList;
import java.util.function.Predicate;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/18 15:19
 */
public class P46{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //删除所有偶数
        Predicate<Integer> isEven = x -> (x % 2) == 0;

        list.removeIf(isEven);

        list.forEach(x-> System.out.println(x+" "));

    }
}
