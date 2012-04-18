package datatypes;

/**
 * Created with IntelliJ IDEA.
 * User: Александр
 * Date: 10.04.12
 * Time: 10:00
 * To change this template use File | Settings | File Templates.
 */
public class PrimitiveTypes {
    public static void main(String[] args) {
//        compareIntsTest();
        compareStringsTest();
        long l = 10;
    }

    private static void displayResult(boolean comparingResult) {
        System.out.println(comparingResult);
    }

    private static void allPrimitiveTypes() {
        boolean bool = true; // 1 byte true, false
        byte  byt = 3; // 1 byte   0, +-1
        short sh = 6; //  2 bytes   0, +-1
        char ch = 'A'; //  2 bytes 0, 1, 2
        int i = 10; // 4 bytes   0, +-1
        long lon = 654456; // 8 bytes 0, +-1
        float fl = 20; //  4 bytes   0.001
        double dou = 1.7; //  8 bytes   0.0001


    }

    private static void compareIntsTest() {
        boolean comparingResult1 = compareInts(3, 4);
        boolean comparingResult2 = compareInts(5, 5);
        displayResult(comparingResult1);
        displayResult(comparingResult2);
    }

    private static boolean compareInts(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    private static void compareStringsTest() {
        String str1 = new String("abc");
        String str2 = new String("def");
        String str3 = new String("abc");

        boolean comparingResult1 = compareStrings(str1, str2);
        boolean comparingResult2 = compareStrings(str1, str3);
        displayResult(comparingResult1);
        displayResult(comparingResult2);
    }


    public static boolean compareStrings(String str1, String str2) {
        if (str1 == str2) {
            return true;
        } else {
            return false;
        }
    }

}
