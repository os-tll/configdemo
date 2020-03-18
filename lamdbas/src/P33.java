import java.util.Iterator;

/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/9 17:34
 */
public interface P33 extends Iterator {
    /**
     * 跳过i个元素
     * @param i 要跳过的元素数量
     * @return void
     * @author tanglonglong ＼(－－)／
     * @date 11:02 2020/3/18
     */
    default void skip(int i) {
        for(;i>0 && hasNext(); i--){
            next();
        }
    }
}


