//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

public class Lesson_17_Activity {
    public Lesson_17_Activity() {
    }

    public static boolean isSorted(int[] var0) {
        for(int var1 = 0; var1 < var0.length - 1; ++var1) {
            if(var0[var1] > var0[var1 + 1]) {
                return false;
            }
        }

        return true;
    }

    public static int binarySearch(int[] var0, int var1) {
        for(int var2 = 0; var2 < var0.length; ++var2) {
            if(var0[var2] == var1) {
                return var2;
            }
        }

        return -1;
    }
}
