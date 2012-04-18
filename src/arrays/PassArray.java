package arrays;

/**
 * Created with IntelliJ IDEA.
 * User: Александр
 * Date: 17.04.12
 * Time: 10:14
 * To change this template use File | Settings | File Templates.
 */
public class PassArray {
    public static void main(String[] args) {
        int a = 10;
        changePrimitive(a);
        System.out.println(a);

        int[] arr = {1,2,3};
        changeArray(arr);

        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void changePrimitive(int a) {
        a = 5;
    }

    private static void changeArray(int[] array) {
        for(int i = 0; i < array.length; i++) {
          array[i] = 0;
        }
    }
}
