/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/9 16:25
 */
class Hello {
    public Runnable r = new Runnable() {
        @Override
        public void run() {
            System.out.println(this);
            System.out.println(toString());
        }
    };

    @Override
    public String toString() {
        return "Hello's custom toString()";
    }
}

public class P21 {
    public static void main(String... args) {
        Hello h = new Hello();
        h.r.run();
    }
}



