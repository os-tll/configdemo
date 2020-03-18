/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/9 16:56
 */
    class Hello3 {
        public Runnable r = () -> {
            System.out.println(this);
            System.out.println(toString());
        };

        @Override
        public String toString() {
            return "Hello's custom toString()";
        }
    }
public class P23 {
    public static void main(String... args) {
        Hello3 h = new Hello3();
        h.r.run();
    }
}
