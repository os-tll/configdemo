import java.util.Arrays;
import java.util.List;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/9 17:34
 */
public class P34 {
    /**
     * 构造器
     * @param fn 姓氏
     * @param ln 名字
     * @param a 年龄
     */
    public P34(String fn, String ln, int a) {
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
    public static List<P34> people = Arrays.asList(
            new P34("Ted", "Neward", 42),
            new P34("Charlotte", "Neward", 39),
            new P34("Michael", "Neward", 19),
            new P34("Candy", "Ford", 39),
            new P34("Jeff", "Brown", 43),
            new P34("Betsy", "Brown", 39)
    );

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


