package arrays;

import java.util.Arrays;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Александр
 * Date: 17.04.12
 * Time: 9:48
 * To change this template use File | Settings | File Templates.
 */
public class SimpleArray {
    public static void main(String[] args) {

        Integer[] array = new Integer[10];
        //array={0,1,2,3,4,5,6,7,8,9};

        for(int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        Integer[][] array2d = new Integer[2][3];
        int k = 0;
        for(int i = 0; i < array2d.length; i++) {
            for(int j = 0; j < array2d[i].length; j++) {
                array2d[i][j] = ++k;
            }
        }

        for(int i = 0; i < array2d.length; i++) {
            for(int j = 0; j < array2d[i].length; j++) {
                System.out.print(array2d[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }

        int[][] arrayVar = new int[5][];
        arrayVar[0] = new int[2];
        arrayVar[1] = new int[5];

        List<Integer> list = Arrays.asList(array);

        System.out.println(list);
    }


}
