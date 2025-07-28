public class Search_Insert_Opration_35 {
    public static void main(String[] args) {
        int nums[] = { 1, 3, 4, 6, 7 };
        int target = 6;
        int i;
        for (i = 0; i < nums.length;i++)
        {
            if (nums[i] <= target) {
                if (nums[i] == target) {
                    System.out.println("Your Element Current Index Is :::::::: " + i);
                    break;
                }
            }
            else
            {
                System.out.println("Your Element Excpected Result Is :::::::: " + i);
                break;
            }
        }
        if(i == nums.length)
        {
            i = i - 1;
            if(target > nums[i])
            {
                System.out.println("Your Element Excpected Result Is ::::::::: " + (i+1)); 
            }
        }
        
    }
}
