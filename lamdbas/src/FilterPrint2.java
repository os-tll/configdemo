import java.util.List;
import java.util.function.Predicate;

/**
 * 示例一： 使用Lamdba重构后
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/9 14:46
 */
/*对属性进行筛选后，进行打印*/
public class FilterPrint2 {
    /*筛成年男性为第一组，进行打印*/
    //--> 这里发生了变化  传入 Predicate 的实现 <--
    public void method1(List<Person> pl, Predicate<Person> pred){
        for(Person p:pl){
            if (pred.test(p)){
                printManAndAdult(p);
            }
        }
    }
    /*筛未成年女性为第二组，进行打印*/
    //--> 这里发生了变化  传入 Predicate 的实现 <--
    public void method2(List<Person> pl, Predicate<Person> pred){
        for(Person p:pl){
            if (pred.test(p)){
                printWomenAndChild(p);
            }
        }
    }
    public void printManAndAdult(Person p){
        System.out.println("Group1 " + p.getGivenName() + " " + p.getSurName() + " age " + p.getAge());
    }

    public void printWomenAndChild(Person p){
        System.out.println("Group2 " + p.getGivenName() + " " + p.getSurName() + " age " + p.getAge());
    }
}
