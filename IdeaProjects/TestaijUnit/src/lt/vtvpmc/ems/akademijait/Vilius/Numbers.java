package lt.vtvpmc.ems.akademijait.Vilius;

public class Numbers {
    public static double power(int number, int power) {
      for (int i = 0; i <= power; i++){
        number *= number;
    }
    return number;
}
