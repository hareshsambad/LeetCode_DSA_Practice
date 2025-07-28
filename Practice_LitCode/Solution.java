class Solution {
    public static void main(String[] args) {
        int ans = 0;
        int num = 1534236469;
        int mNum;
    

        if(num > Integer.MAX_VALUE || num < Integer.MIN_VALUE)
        {
            System.out.println("Crash :::");
        }
        else{

        if(num >= 0)
        {
            while(num > 0)
            {
                mNum = num % 10;
                ans = ((ans*10) + mNum);
                num = num / 10;
                System.out.println("ANs : " + mNum + "  " + ans + "  " + mNum);
            }
                System.out.println("your P ANs Is : " + ans);
        }
        else
        {
             while(num < 0)
            {
                mNum = num % 10;
                ans = ans*10 + mNum;
                num = num / 10;
            }
                System.out.println("your N ANs Is : " + ans);
        }

    }

        
    }
}