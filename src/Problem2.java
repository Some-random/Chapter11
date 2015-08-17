import CtCILibrary.CtCILibrary.AssortedMethods;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;

/**
 * Created by Bob_JIANG on 8/17/2015.
 */
public class Problem2 {
    public static String convert(String s) {
        char[] temp = s.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }

    public static void sort(String[] array) {
        HashMap<String, LinkedList<String>> HSL = new HashMap<>();
        int i;
        for(i = 0; i < array.length; i++) {
            String s = convert(array[i]);
            if(!HSL.containsKey(s)) {
                HSL.put(s, new LinkedList<String>());
            }
            HSL.get(s).push(array[i]);
        }
        i = 0;
        for(LinkedList<String> LS : HSL.values()) {
            for(String s : LS) {
                array[i] = s;
                i++;
            }
        }
    }

    //The use of hashmap, using sort saves the time to compare hashvalue
    public static void main(String[] args) {
        String[] array = {"apple", "banana", "carrot", "ele", "duck", "papel", "tarroc", "cudk", "eel", "lee"};
        sort(array);
        System.out.println(AssortedMethods.stringArrayToString(array));
    }
}
