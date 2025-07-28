
import java.util.ArrayList;
import java.util.Collections;

public class Find_Max_Consecutive_Ones_485
{
    public static void main(String[] args) {
        int nums[] = { 1, 1, 0, 1, 1, 1 };
        ArrayList<Integer> repeat_ones = find_max_one(nums);
        calc_ans(repeat_ones);
    }
 
    static void calc_ans(ArrayList<Integer> repeat_ones)
    {
        Collections.sort(repeat_ones);
        int max = Collections.max(repeat_ones);
        System.out.println("Maximum element: " + max);
    }

    static ArrayList<Integer> find_max_one(int nums[])
    {
        ArrayList<Integer> repeat_ones = new ArrayList<Integer>();
        int count = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] == 1) {
                count++;
            } else {
                repeat_ones.add(count);
                count = 0;
            }
            repeat_ones.add(count);
        }
        return repeat_ones;
    }
    


}
