package datastructures;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: Александр
 * Date: 17.04.12
 * Time: 10:28
 * To change this template use File | Settings | File Templates.
 */
public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(5);
        list.add(5);
        list.add(10);

        List<Integer> list2 = new ArrayList<Integer>();
        list2.add(6);
        list2.addAll(list);


        System.out.println(list);
    }
}
