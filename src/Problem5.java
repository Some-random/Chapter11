/**
 * Created by Bob_JIANG on 8/17/2015.
 */
public class Problem5 {
    public static int search(String[] stringlist, String target) {
        int low = 0, high = stringlist.length - 1, middle;
        while(low < high) {
            middle = (low + high) / 2;
            if(stringlist[middle].equals(target)) {
                return middle;
            }
            else if(stringlist[middle].equals("")) {
                for(int i = middle + 1; i <= high; i++) {
                    if(stringlist[i].equals(target)) {
                        return i;
                    }
                }
                high = middle - 1;
            }
            else if(stringlist[middle].compareTo(target) > 0) {
                high = middle - 1;
            }
            else if(stringlist[middle].compareTo(target) < 0) {
                low = middle + 1;
            }
        }
        return -1;
    }

    //Basically the same as array with duplicates, if unlucky, search half of the array
    public static void main(String[] args) {
        String[] stringList = {"apple", "", "", "banana", "", "", "", "carrot", "duck", "", "", "eel", "", "flower"};

        for (String s : stringList) {
            String cloned = new String(s);
            System.out.println("<" + cloned + "> " + " appears at location " + search(stringList, cloned));
        }
    }
}
