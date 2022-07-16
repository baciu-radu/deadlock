public class Deadlock {
    public static Integer c(Integer i) {
        if (i == 0) {
//            System.out.println("0");
            return 0;
        } else {
            return c(i-1) + c(i-2);
        }
    }
    public static void main(String []args) {
        System.out.println(Deadlock.c(10));
    }

}
