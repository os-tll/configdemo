import java.util.Comparator;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/9 17:34
 */
public class P26_2 {
    public String firstName;
    public String lastName;
    public int age;

    public P26_2(String f, String l, int a) {
        firstName = f;
        lastName = l;
        age = a;
    }

    @Override
    public String toString() {
        return "[Person: firstName:" + firstName + " " + "lastName:" + lastName + " " + "age:" + age + "]";
    }
}


