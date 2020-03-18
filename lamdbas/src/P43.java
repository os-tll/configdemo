import java.util.function.Consumer;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/18 15:19
 */
public class P43 {
    public static void main(String[] args) {
        Consumer<P38> consumer1 = P43::accept1;
        Consumer<P38> consumer2 = P43::accept2;
        consumer1.andThen(consumer2).accept(P38.people.get(0));
    }

    public static void accept1(P38 x) {
        System.out.println("FirstName: "+x.getFirstName());
    }
    public static void accept2(P38 x) {
        System.out.println("LastName: "+x.getLastName());
    }
}
