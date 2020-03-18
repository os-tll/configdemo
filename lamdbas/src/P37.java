import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/9 17:34
 */
public class P37 {
    /**
     * 构造器
     *
     * @param fn 姓氏
     * @param ln 名字
     * @param a  年龄
     */
    public P37(String fn, String ln, int a) {
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
    public static List<P37> people = Arrays.asList(
            new P37("Ted", "Neward", 42),
            new P37("Charlotte", "Neward", 39),
            new P37("Michael", "Neward", 19),
            new P37("Candy", "Ford", 39),
            new P37("Jeff", "Brown", 43),
            new P37("Betsy", "Brown", 39)
    );

    /**
     * 在这里将比较捕获为一个比较器实例
     *  使用处示例Collections.sort(P37.people,  Person::compareLastAndAge)
     */
    public static int compareLastAndAge(P37 lhs, P37 rhs) {
        if (lhs.lastName.equals(rhs.lastName)) {
            return lhs.age - rhs.age;
        } else {
            return lhs.lastName.compareTo(rhs.lastName);
        }
    }



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


