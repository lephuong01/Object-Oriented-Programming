package oop.hus.lab8.sets;

import java.util.*;

public class Sets {
    /**
     * Write a function returning the intersection of two given sets (without using library functions)
     */
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<>();
        for (Integer i : first) {
            if (second.contains(i)) {
                result.add(i);
            }
        }
        return result;
    }

    /**
     * Write a function returning the union of two given sets (without using library functions)
     */
    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<>();
        for (int i : first) {
            result.add(i);
        }
        for (int i : second) {
            result.add(i);
        }
        return result;
    }

    /**
     * Write a function returning the intersection of two given sets (see retainAll())
     */
    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<>(first);
        result.retainAll(second);
        return result;
    }

    /**
     * Write a function returning the union of two given sets (see addAll())
     */
    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        Set<Integer> result = new HashSet<>(first);
        result.addAll(second);
        return result;
    }

    /**
     * Write a function to transform a set into a list without duplicates
     * Note well: collections can be created from another collection!
     */
    public static List<Integer> toList(Set<Integer> source) {
        return new ArrayList<>(source);
    }

    /**
     * Write a function to remove duplicates from a list
     * Note well: collections can be created from another collection!
     */
    public static List<Integer> removeDuplicates(List<Integer> source) {
        return new ArrayList<>(new HashSet<>(source));
    }

    /**
     * Write a function to remove duplicates from a list without using the constructors trick seen above
     */
    public static List<Integer> removeDuplicatesManual(List<Integer> source) {
        Set<Integer> seen = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for (int i : source) {
            if (!seen.contains(i)) {
                seen.add(i);
                result.add(i);
            }
        }
        return result;
    }

    /**
     * Write a function accepting a string s
     * returning the first recurring character
     * For example firstRecurringCharacter("abaco") -> a.
     */
    public static String firstRecurringCharacter(String s) {
        if (s == null || s.length() == 0) {
            return null;
        }
        Set<Character> result = new HashSet<>();
        for (char c : s.toCharArray()) {
            if (result.contains(c)) {
                return Character.toString(c);
            } else {
                result.add(c);
            }
        }
        return null;
    }

    /**
     * Write a function accepting a string s, and returning a set comprising all recurring characters.
     * For example allRecurringChars("mamma") -> [m, a].
     */
    public static Set<Character> allRecurringChars(String s) {
        Set<Character> set = new HashSet<>();
        Set<Character> result = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                result.add(c);
            } else {
                set.add(c);
            }
        }
        return result;
    }

    /**
     * Write a function to transform a set into an array
     */
    public static Integer[] toArray(Set<Integer> source) {
        return source.toArray(new Integer[]{});
    }

    /**
     * Write a function to return the first item from a TreeSet
     * Note well: use TreeSet specific methods
     */
    public static int getFirst(TreeSet<Integer> source) {
        return source.first();
    }

    /**
     * Write a function to return the last item from a TreeSet
     * Note well: use TreeSet specific methods
     */
    public static int getLast(TreeSet<Integer> source) {
        return source.last();
    }

    /**
     * Write a function to get an element from a TreeSet which is strictly greater than a given element.
     * Note well: use TreeSet specific methods
     */
    public static int getGreater(TreeSet<Integer> source, int value) {
        return source.higher(value);
    }
}
