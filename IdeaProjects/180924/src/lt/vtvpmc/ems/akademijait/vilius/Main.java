package lt.vtvpmc.ems.akademijait.vilius;


public class Main {
    public static void main(String[] args) {
        byte a = 100;
        System.out.println("a = " + a);
        printBinary(a, 8);
        byte b = 28;
        System.out.println("b = " + b);
       printBinary(b, 8);
       byte c = (byte) (a + b);
       printBinary(c, 8);
       System.out.println("c = " + c);

    }

    private static void printBinary(byte value, int size) {
       for (int i = size - 1; i>=0; i--){
           long mask = 1 << i;
           long result = (mask & value) >> i;
           System.out.print(result);

    }
    System.out.println();

}
}