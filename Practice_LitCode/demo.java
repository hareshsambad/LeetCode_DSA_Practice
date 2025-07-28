import java.util.ArrayList;
import java.util.Collections;

public class demo {
    public static void main(String[] args) {
        int nums[] = { 1, 1, 0, 1, 1, 1 };
        ArrayList<Integer> repeat_ones = new ArrayList<Integer>();
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                count++;
            } else {
                repeat_ones.add(count);
                count = 0;
            }
        }
        repeat_ones.add(count);
          
        System.out.println(repeat_ones);
        
        Collections.sort(repeat_ones);
        int max = Collections.max(repeat_ones);
        System.out.println("Maximum element: " + max);
    }
}
