import java.util.ArrayList;
import java.util.List;

/**
 * 实例二： 使用 Lamdba 重构后
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/9 15:45
 */
public class DealList2 {
    public static void main(String[] args) throws Exception {

        // 开始时间
        long start = System.currentTimeMillis();
        List<String> list = new ArrayList<String>();

        for (int i = 1; i <= 3000; i++) {
            list.add(i + "");
        }
        list.parallelStream().forEach((p)->{
            //...进行数据库对比等业务代码
        });
        System.err.println("执行任务消耗了 ：" + (System.currentTimeMillis() - start) + "毫秒");
    }


}
