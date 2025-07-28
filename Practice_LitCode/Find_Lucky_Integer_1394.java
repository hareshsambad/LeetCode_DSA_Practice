public class Find_Lucky_Integer_1394 {
    public static void main(String[] args) {
        int nums[] = {2,2,3,3,3};
        int count_eah_number = 0;
        int preNum = -1;
        int curruntNum;

        for (int i = 0; i < nums.length; i++)
        {
            curruntNum = nums[i];
            count_eah_number = 0;
            for (int j = i; j < nums.length; j++)
            {
                if (nums[i] == nums[j]) {
                    count_eah_number++;
                }
            }

            if(curruntNum == preNum)
            {
                continue;
            }
            preNum = curruntNum;

            if(nums[i] == count_eah_number)
            {
                System.out.println("Your Lucky number Is ::: " + nums[i]);
            }
            
            
        }
    }
}
