package lt.vtvpmc.ems.akademijait.Vilius;

public class PostInc {
    public static void main(String[] args) {
        int a = 10;
        boolean bl = (a++ == ++a);
        System.out.println(bl);
        System.out.println(a++);
        System.out.println(++a);
    }
}
