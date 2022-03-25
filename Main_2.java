package ENDOFBASICS1;

public class Main_2 {
    /**
     * @param s: The first string
     * @param b: The second string
     * @return true or false
     */
   public static boolean anagram_test(String str1, String str2) {
    if (str1 == null || str2 == null) {
        return false;
    } else if (str1.length() != str2.length()) {
        return false;
    } else if (str1.length() == 0 && str2.length() == 0) {
        return true;
    }
    int[] count = new int[256];
    for (int i = 0; i < str1.length(); i++) {
        count[str1.charAt(i)]++;
        count[str2.charAt(i)]--;
    }
    for (int num : count) {
        if (num != 0) {
            return false;
        }
    }
    return true;
}
public static void main(String[] args) {
    String str1 = "wxyz";
    String str2 = "zyxw";
    System.out.println("String-1 : "+str1);
    System.out.println("String-2 : "+str2);
    System.out.println("Check if two given strings are anagrams or not?: "+anagram_test(str1,str2));
}		
}
