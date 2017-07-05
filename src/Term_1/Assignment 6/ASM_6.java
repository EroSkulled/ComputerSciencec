import java.util.*;

/*记得把'ASM_6'替换成Main*/
public class ASM_6 {

    public static boolean isSorted(Integer[] a){
        for (int i = 0; i < a.length - 1; i++) {
            if (a[i] > a[i + 1]) {
                return false;
            }
        }
        return true; // If this part has been reached, the array must be sorted.
    }

    public static Integer[] toIntArray(String a){
        Integer[] intArray;
        intArray = new Integer[a.length()];
        for(int i = 0; i < a.length(); i++){
            intArray[i] = Integer.parseInt(a.toCharArray()[i] + "");
        }
        return intArray;
    }

    public static Integer getMinIndex(Integer[] a){
        int index = 0;
        int min = 9999;
        for (int i = 0; i < a.length; i++){
            if (a[i] < min && a[i] > 0){
                min = a[i];
                index = i;
            }
        }
        return index;
    }

    public static Integer min(Integer a, Integer b) {
        if (a == b) {
            return 0;
        } else if (a == 0) {
            return 1;
        } else if (b == 0) {
            return -1;
        } else if (a > b) {
            return 1;
        } else {
            return -1;
        }
    }

    public static Integer[] meregeArray(Integer[] a, Integer[] b){
        int count = 0;
        Integer[] result = new Integer[a.length + b.length];
        while (true){
            Integer indexA = getMinIndex(a);
            Integer indexB = getMinIndex(b);
            if (min(a[indexA], b[indexB]) == 0) {
                result[count] = a[indexA];
                count++;
                result[count] = a[indexA];
                a[indexA] = 0;
                b[indexB] = 0;
            } else if (min(a[indexA], b[indexB]) == 1) {
                result[count] = b[indexB];
                b[indexB] = 0;
            } else {
                result[count] = a[indexA];
                a[indexA] = 0;
            }
            if (count == (a.length + b.length - 1)){
                break;
            }
            count++;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the values for the first array, up to 10000 values, enter zero or a negative number to quit");
        Integer[] a1 = new Integer[10000];
        int count = 0;
        while (true) {
            Integer tempa1 = s.nextInt();
            if (tempa1 <= 0) break;
            a1[count] = tempa1;
            count++;
        }
        a1 = Arrays.copyOfRange(a1, 0, Arrays.asList(a1).indexOf(null));
        System.out.println();
        System.out.println("Enter the values for the second array, up to 10000 values, enter zero or a negative number to quit");
        Integer[] a2 = new Integer[10000];
        count = 0;
        while (true) {
            Integer tempa2 = s.nextInt();
            if (tempa2 <= 0) break;
            a2[count] = tempa2;
            count++;
        }
        a2 = Arrays.copyOfRange(a2, 0, Arrays.asList(a2).indexOf(null));
        System.out.println();
        System.out.println("First Array: ");
        for (Integer i: a1) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        System.out.println("Second Array: ");
        for (Integer i: a2) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();
        if (isSorted(a1) && isSorted(a2)){
            Integer[] ia = new Integer[a1.length + a2.length];
            System.arraycopy(a1, 0, ia, 0, a1.length);
            System.arraycopy(a2, 0, ia, a1.length, a2.length);
            Arrays.sort(ia);
            System.out.println("Merged Array:");
            for (Integer i:ia){
                System.out.print(i.toString() + " ");
            }
        } else {
            System.out.println("ERROR: Array not in correct order");
        }


    }
}
