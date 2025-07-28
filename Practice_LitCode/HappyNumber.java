
import java.util.Scanner;


public class HappyNumber
{
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        num = sc.nextInt();
        boolean happy = isHappy(num);
        if(happy)
        {
            System.out.println("Your Number "+num+" Is Happy :");
        }
        else
        {
            System.out.println("Your Number "+num+" Is Not Happy :");

        }
        sc.close();
        
    }

    public static boolean isHappy(int num)
    {
        int count = 0;
        int temp = num;
        int sum = 0;
        int modulotemp;
     
        int array[] = new int[5];

        while (sum != 1) { 
            count++;
            if(temp > 0) {
                int i = 0;
                while(temp > 0)
                {
                    modulotemp = temp % 10;
                    temp = temp / 10;
                    array[i] = modulotemp;
                    i++;
                }


                for(int j = 0 ; j < array.length ; j++ )
                {
                    sum = sum + array[j]*array[j];
                }

                for(int k = 0 ; k < array.length ; k++ )
                {
                    array[k] = 0;
                }
            
            
                System.out.println("sum step 1 ::: "  + sum);
                temp = sum;
                if(sum == 1)
                {
                    sum = 1;
                }
                else
                {
                    sum = 0;
                }
            }
            if (count == 1000) {
                return false;
            }
           
            
        }
        return true;
    
    }
}
