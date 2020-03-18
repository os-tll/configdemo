import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/9 17:34
 */
public class P36 {
    /**
     * 构造器
     *
     * @param fn 姓氏
     * @param ln 名字
     * @param a  年龄
     */
    public P36(String fn, String ln, int a) {
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
    public static List<P36> people = Arrays.asList(
            new P36("Ted", "Neward", 42),
            new P36("Charlotte", "Neward", 39),
            new P36("Michael", "Neward", 19),
            new P36("Candy", "Ford", 39),
            new P36("Jeff", "Brown", 43),
            new P36("Betsy", "Brown", 39)
    );
    /**
     * 在这里将比较捕获为一个比较器实例
     * 使用处示例： Collection.sort（P36.person, P36.BY_LAST_AND_AGE）;
     */
    public static final Comparator<P36> BY_LAST_AND_AGE =
            (lhs, rhs) -> {
                if (lhs.lastName.equals(rhs.lastName)) {
                    return lhs.age - rhs.age;
                } else {
                    return lhs.lastName.compareTo(rhs.lastName);
                }
            };


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
}


