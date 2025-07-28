public class Power_50 {
    public static void main(String[] args) {
        double x = 2;
        double n = 0;
        int i = 1;
        double ans = x;

        if (n == 1) 
        {
            System.out.println("your Ans Is :::::::: " + ans);
        }
        else if(n == 0)
        {
            System.out.println("Your Ans Is " + ans/ans);
        }
        else if (n < 0) 
        {
            
            while (i < Math.abs(n)) {
                ans = ans * x;
                System.out.println(ans);
                i++;
            }
            System.out.println("Your Answer Is ::::::::::::: " + (1/ans));
        } 
        else 
        {
            while (i < Math.abs(n)) 
            {
                ans = ans * x;
                System.out.println("Your Answer Is ::::::::::::: " + ans);
                i++;
            }

        }
    }
}