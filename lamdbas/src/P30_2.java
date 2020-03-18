/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/9 17:34
 */
public class P30_2 {
    public String firstName;
    public String lastName;
    public int age;

    public P30_2(String f, String l, int a) {
        firstName = f;
        lastName = l;
        age = a;
    }
    public static int compareFirstNames(P30_2 lhs, P30_2 rhs) {
        return lhs.firstName.compareTo(rhs.firstName);
    }
    @Override
    public String toString() {
        return "[Person: firstName:" + firstName + " " + "lastName:" + lastName + " " + "age:" + age + "]";
    }
}


