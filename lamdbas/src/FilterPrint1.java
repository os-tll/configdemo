import java.util.List;

/**
 * 示例一： 重构前
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/9 14:01
 */
/*对属性进行筛选后，进行打印*/
public class FilterPrint1 {

    /*筛成年男性为第一组，进行打印*/
    public void method1(List<Person> pl) {
        for (Person p : pl) {
            if (isManAndAdult(p)) {
                printManAndAdult(p);
            }
        }
    }

    /*筛未成年女性为第二组，进行打印*/
    public void method2(List<Person> pl) {
        for (Person p : pl) {
            if (isWomenAndChild(p)) {
                printWomenAndChild(p);
            }
        }
    }


    private boolean isManAndAdult(Person p) {
        return p.getAge() >= 18 && p.getSex() == "男";
    }

    private boolean isWomenAndChild(Person p) {
        return p.getAge() < 18 && p.getSex() == "女";
    }

    private void printManAndAdult(Person p) {
        System.out.println("Group1 " + p.getGivenName() + " " + p.getSurName() + " age " + p.getAge());
    }

    private void printWomenAndChild(Person p) {
        System.out.println("Group2 " + p.getGivenName() + " " + p.getSurName() + " age " + p.getAge());
    }
}


