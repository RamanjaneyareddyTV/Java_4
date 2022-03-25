package ENDOFBASICS1;
import java.util.*;

public class Main_1 {
    /**
     * @param str: a string
     * @return: a boolean
     */
    public static boolean is_Unique_str(String str) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        for (int i = 1; i < chars.length; ++i) {
            if (chars[i] == chars[i-1]) {
                return false;
            }
        }
        return true;
    }
public static void main(String[] args) {
		//String str = "xyz";
		String str = "xyyz";
		System.out.println("Original String : "+str);
		System.out.println("String has all unique characters: "+is_Unique_str(str));
	}		
}
