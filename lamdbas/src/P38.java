import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/9 17:34
 */
public class P38 {
    /**
     * 构造器
     *
     * @param fn 姓氏
     * @param ln 名字
     * @param a  年龄
     */
    public P38(String fn, String ln, int a) {
        this.firstName = fn;
        this.lastName = ln;
        this.age = a;
    }

    /**
     * 姓氏
     */
    private String firstName;
    /**
     * 名字
     */
    private String lastName;
    /**
     * 年龄
     */
    private int age;
    /**
     * 一组用户
     */
    public static List<P38> people = Arrays.asList(
            new P38("Ted", "Neward", 42),
            new P38("Charlotte", "Neward", 39),
            new P38("Michael", "Neward", 19),
            new P38("Candy", "Ford", 39),
            new P38("Jeff", "Brown", 43),
            new P38("Betsy", "Brown", 39)
    );

    /**
     * 在这里将比较捕获为一个比较器实例
     */
    public static final Comparator<P38> BY_FIRST =
            (lhs, rhs) -> lhs.firstName.compareTo(rhs.firstName);

    public static final Comparator<P38> BY_LAST =
            (lhs, rhs) -> lhs.lastName.compareTo(rhs.lastName);

    public static final Comparator<P38> BY_AGE =
            (lhs, rhs) -> lhs.age - rhs.age;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "[Person: firstName:" + firstName + " " + "lastName:" + lastName + " " + "age:" + age + "]";
    }

    public static String toJSON(P38 p) {
        return
                "{" +
                        "firstName: \"" + p.firstName + "\", " +
                        "lastName: \"" + p.lastName + "\", " +
                        "age: " + p.age + " " +
                        "}";
    }
}


