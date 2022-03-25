package ENDOFBASICS1;
import java.util.*;


public class Main_8 {
    public static void main(String[] args) {
		String s = "wresource";
		System.out.println("Original String: "+s);
        System.out.println("First unique character of the above: "+first_Uniq_Char(s));
    }

    public static int first_Uniq_Char(String s) {
         int[] freq = new int[256];
        for (char c : s.toCharArray()) {
            freq[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) return i;
        }
        return -1;
	}
}
