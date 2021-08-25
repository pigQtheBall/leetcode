package leetcode.utils;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayUtils {
    public static int[] from(String str) {
        ArrayList<Integer> ret = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (c == '-' || Character.isDigit(c)) {
                sb.append(c);
            } else if (sb.length() > 0) {
                ret.add(Integer.parseInt(sb.toString()));
                sb = new StringBuilder();
            }
        }

        int[] intArray = new int[ret.size()];
        Iterator<Integer> it = ret.iterator();
        for (int i = 0; i < ret.size(); i++) {
            intArray[i] = it.next();
        }
        return intArray;
    }
}
