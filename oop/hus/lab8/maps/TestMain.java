package oop.hus.lab8.maps;

import java.util.HashMap;
import java.util.Map;

public class TestMain {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);
        System.out.println(map);
        System.out.println(Maps.count(map));
        Maps.empty(map);
        System.out.println(map);
        map.put(1, 10);
        map.put(2, 20);
        map.put(3, 30);
        System.out.println(Maps.contains(map, 1));
        System.out.println(Maps.contains(map, 4));
        System.out.println(Maps.containsKeyValue(map, 1, 10));
        System.out.println(Maps.containsKeyValue(map, 1, 20));
        System.out.println(Maps.keySet(map));
        System.out.println(Maps.values(map));
        System.out.println(Maps.getColor(0));
        System.out.println(Maps.getColor(-1));
    }
}
