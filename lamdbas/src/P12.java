/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/9 15:56
 */
public class P12 {
//    public static void main(String... args) {
//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Howdy, world!");
//            }
//        };
//        r.run();
//    }

    public static void main(String... args) {
        Runnable r2 = () -> System.out.println("Howdy, world!");
        r2.run();
    }

}
