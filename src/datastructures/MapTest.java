package datastructures;

import java.util.HashMap;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * User: Александр
 * Date: 17.04.12
 * Time: 10:50
 * To change this template use File | Settings | File Templates.
 */
public class MapTest {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<String, Integer>();
        map.put("word", 10);
        map.put("test", 10);
        map.put("one", 10);

        System.out.println(map);
    }
}
