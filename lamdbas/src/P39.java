import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/9 17:34
 */
public class P39 {
    /**
     * 构造器
     *
     * @param fn 姓氏
     * @param ln 名字
     * @param a  年龄
     */
    public P39(String fn, String ln, int a) {
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
    public static List<P39> people = Arrays.asList(
            new P39("Ted", "Neward", 42),
            new P39("Charlotte", "Neward", 39),
            new P39("Michael", "Neward", 19),
            new P39("Candy", "Ford", 39),
            new P39("Jeff", "Brown", 43),
            new P39("Betsy", "Brown", 39)
    );

    /**
     * 从对象中提取一个比较键并返回一个基于该键进行排序的比较器
     */
    public static final Comparator<P39> BY_FIRST =
            Comparator.comparing(P39::getFirstName);

    public static final Comparator<P39> BY_LAST =
            Comparator.comparing(P39::getLastName);

    public static final Comparator<P39> BY_AGE =
            Comparator.comparing(P39::getAge);

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


