package Fridayevening;
import java.util.*;
public class main_13 {
  public static  void main(String[] arg) 
   {
	 int nums[] = {10, 20, 10, 20, 30, 40, 40, 30, 50};
	 int result;
	 System.out.println("Source Array : "+Arrays.toString(nums));   
     result = getSingleNumber(nums);
     System.out.println("\n"+result+" appears only once.");
    }

     public static int getSingleNumber(int[] nums) {
       if(nums == null || nums.length == 0) {
         return -1;
        }
        int result = 0;
        for (int i = 0; i < nums.length; i++) {
            result ^= nums[i];
        }
        return result;
    }
}

