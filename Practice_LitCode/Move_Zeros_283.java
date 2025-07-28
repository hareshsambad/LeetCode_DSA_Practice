public class Move_Zeros_283 {
    public static void main(String[] args) {
        int nums[] = { 1,3,4,2,15,0,18,0,6};
        int nonZeroIndex = 0;


        if(nums.length == 1)
        {
            return;
        }
        for (int i = 0; i < nums.length; i++)
        {
            if(nums[i] != 0)
            {
                nums[nonZeroIndex] = nums[i];
                nonZeroIndex++;
            }
        }

        
            while(nonZeroIndex < nums.length)
            {
                nums[nonZeroIndex] = 0;
                nonZeroIndex++;
            }

            for(int i = 0; i < nums.length ; i++)
            {
                System.out.print(nums[i] + ",");
            }
            
    }
}
