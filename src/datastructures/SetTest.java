package datastructures;

import java.util.HashSet;
import java.util.Set;

/**
 * Created with IntelliJ IDEA.
 * User: Александр
 * Date: 17.04.12
 * Time: 10:46
 * To change this template use File | Settings | File Templates.
 */
public class SetTest {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(5);
        set.add(10);
        set.add(5);

        System.out.println(set);
    }
}
