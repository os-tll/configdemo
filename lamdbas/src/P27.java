import java.util.Comparator;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/9 17:34
 */
public class P27 {
    public String firstName;
    public String lastName;
    public int age;

    public final static Comparator<P27> compareFirstName =
            (lhs, rhs) -> lhs.firstName.compareTo(rhs.firstName);

    public final static Comparator<P27> compareLastName =
            (lhs, rhs) -> lhs.lastName.compareTo(rhs.lastName);


    public P27(String f, String l, int a) {
        firstName = f;
        lastName = l;
        age = a;
    }

    @Override
    public String toString() {
        return "[Person: firstName:" + firstName + " " + "lastName:" + lastName + " " + "age:" + age + "]";
    }
}


