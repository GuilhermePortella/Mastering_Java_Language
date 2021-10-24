package Capitulo_5;

import java.util.Random;

/**
 *
 * @author Guilherme
 */
public class MinMax {
    
    public static void main(String[] args) {
        
        int nums[] = new int[80];
        int min, max;

//        nums[0] = 99;
//        nums[1] = 199;
//        nums[2] = 90;
//        nums[3] = -219;
//        nums[4] = 81992;
//        nums[5] = 1211;
//        nums[6] = -991;
//        nums[7] = 15;
//        nums[8] = 9;
//        nums[9] = 1;

        Random rd = new Random();
        for (int i = 0; i < 80; i++) {
            nums[i] = rd.nextInt();
        }
        for (int i = 0; i < 80; i++) {
            System.out.println(nums[i]);
        }
        
        min = max = nums[0];
        
        for (int i = 1; i < 80; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
            if (nums[i] > max) {
                max = nums[i];                
            }
        }
        System.out.println("min and max: " + min + " " + max);
    }
}
