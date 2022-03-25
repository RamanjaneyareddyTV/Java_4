package ENDOFBASICS1;
import java.util.*;

public class Main_9 {
    public static void main(String[] args) {
		String str1 = "xxyz";
		String str2 = "yxzx";
		System.out.println("Original strings: "+str1+"  "+str2);
        System.out.println(stringPermutation(str1, str2));
    }
      public static boolean stringPermutation(String str1, String str2) {
        int[] arr = new int[500];
        for (int i = 0; i < str1.length(); i++) {
            arr[(int) str1.charAt(i)] += 1;
        }
        for (int i = 0; i < str2.length(); i++) {
            arr[(int) str2.charAt(i)] -= 1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) return false;
        }
        return true;
    }
}
