/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/9 16:39
 */
class Hello2 {
    public Runnable r = new Runnable() {
        @Override
        public void run() {
            System.out.println(Hello2.this);
            System.out.println(Hello2.this.toString());
        }
    };

    @Override
    public String toString() {
        return "Hello's custom toString()";
    }
}
public class P22 {
    public static void main(String... args) {
        Hello2 h = new Hello2();
        h.r.run();
    }
}


