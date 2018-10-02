package lt.vtvpmc.ems.akademijait.vilius;

public class Changer {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int box = a;
        a = b;
        b = box;
        System.out.println(a);
        System.out.println(b);

    }
}
