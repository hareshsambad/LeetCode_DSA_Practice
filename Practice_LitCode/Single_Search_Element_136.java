public class Single_Search_Element_136 {
    public static void main(String[] args) {
        Single_Search_Element_136 s1 = new Single_Search_Element_136();
        int ans = s1.calcSingleNumber();
        System.out.println("Ans :::::::::: " + ans);
    }
    
    public int calcSingleNumber()
    {

        int nums[] = { 2, 2, 1 ,5,1,};
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (i != j) 
                {
                    if (nums[i] == nums[j]) 
                    {
                        count++;
                    }
                }
            }
            if (count == 0) {
                System.out.println("Your Single Element Is ::::::: " + nums[i]);
                return nums[i];
            }
        }
        return -1;
    }
}
