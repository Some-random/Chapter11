import CtCILibrary.CtCILibrary.AssortedMethods;

/**
 * Created by Bob_JIANG on 8/17/2015.
 */
public class Problem1 {
    public static void merge(int[] a, int[] b, int lastA, int lastB) {
        int current = a.length - 1;
        lastA--;
        lastB--;
        while(lastA >= 0 && lastB >= 0) {
            if(a[lastA] > b[lastB]) {
                a[current] = a[lastA];
                lastA--;
            }
            else {
                a[current] = b[lastB];
                lastB--;
            }
            current--;
        }
        while(lastB >= 0) {
            a[lastB] = b[lastB];
            lastB--;
        }
    }

    //The hint that A can hold B implies merge sort from the tail
    public static void main(String[] args) {
        int[] a = {2, 3, 4, 5, 6, 8, 10, 100, 0, 0, 0, 0, 0, 0};
        int[] b = {1, 4, 7, 6, 7, 7};
        merge(a, b, 8, 6);
        System.out.println(AssortedMethods.arrayToString(a));
    }
}
