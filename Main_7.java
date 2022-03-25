package ENDOFBASICS1;

public class Main_7 {
    public static void main(String[] args) {
        System.out.println(bitSwapRequired(27, 23));
    }

      public static int bitSwapRequired(int x, int y) {
        int ctr = 0;
        for (int z = x ^ y; z != 0; z = z >>> 1) {
            ctr += z & 1;
        }
        return ctr;
    }
}
