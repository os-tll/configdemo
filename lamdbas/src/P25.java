/**
 * @author tanglonglong ＼(－－)／
 * @version 1.0
 * @date 2020/3/9 17:00
 */
public class P25 {
//    public static void main(String... args) {
//        String message = "Howdy, world!";
//        Runnable r = () -> System.out.println(message);
//        r.run();
//    }

    public static void main(String... args) {
        StringBuilder message = new StringBuilder();
        Runnable r = () -> System.out.println(message);
        message.append("Howdy, ");
        message.append("world!");
        r.run();
    }

}
