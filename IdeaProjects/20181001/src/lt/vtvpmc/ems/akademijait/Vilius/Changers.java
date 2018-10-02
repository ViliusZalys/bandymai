package lt.vtvpmc.ems.akademijait.Vilius;

public class Changers {
    public static void main(String[] args) {


    }

    public static int changeTwoNumbers(int numberOne, int numberTwo){
        int tmp = numberOne;
        numberOne = numberTwo;
        numberTwo = tmp;
        return numberOne;
    }
    public static int changeTwoNumbersVersionTwo(int numberOne, int numberTwo){
        numberOne = numberOne + numberTwo;
        numberTwo = numberOne - numberTwo;
        numberOne = numberOne - numberTwo;
        return numberOne;
    }

    public static int changeTwoNumbersVersionThree(int numberOne, int numberTwo){
        numberOne = numberOne ^ numberTwo;
        numberTwo = numberOne ^ numberTwo;
        numberOne = numberOne ^ numberTwo;
        return numberOne;
    }

    public static void printBinaryDouble(double number) {
        long bits = Double.doubleToLongBits(number);
        for(int i = 63; i >= 0; --i){
            System.out.print((bits & (1 << i)) == 0 ? "0" : "1");
        }

    }
}
