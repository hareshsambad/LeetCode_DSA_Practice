
import java.util.Scanner;

public class TwoSum {
    Scanner sc = new Scanner(System.in);
    int target ;
    int array[];
    int indexOfArray;
    int temp;
    int count = 0;
    int findex;
    int sindex;
    public  static void main(String[] args)
    {
        TwoSum tp = new TwoSum();
        tp.getDetails();
        tp.displayDetails();
        tp.getSolution();
    }

    
    public void getSolution()
    {
        System.out.println("");
        for(int i = 0 ; i < indexOfArray ; i++)
        {
            for(int j = i+1 ; j < indexOfArray ; j++)
            {
                temp = array[i] + array[j];
                if(temp == target)
                {
                    count++;
                    findex = i;
                    sindex = j;
                }
            }
        }

        if(count == 1)
        {
            System.out.println("Wow! You Are Genius : \n You Found Sum Of Two Number In Array as Target And That Index Is [ "+findex+" ] and [ "+sindex+ " ]");

        }
        else if(count > 1) {
            System.out.println("Yes Index Match but It's "+count+ "  times");
        }
        else
        {
            System.out.println("No Index Match : ");
        }
    }






























    public  void getDetails()
    {
        getTarget();
        getIndexOfArray();
        getArrayElement();
    }

    public void getArrayElement()
    {
        System.out.println("Enter Array Element :::");
        for(int i = 0 ; i < indexOfArray ; i++)
        {
            System.out.print("Enter Element of index [ "+i+" ] :: ");
            array[i] = sc.nextInt();
        }
    }

    public void getTarget()
    {
        System.out.print("Enter Target Element :::  ");
        target = sc.nextInt();  
    }

    public void getIndexOfArray()
    {
        System.out.print("Enter Array Index ::: ");
        indexOfArray = sc.nextInt();
        array = new int[indexOfArray];
    }




    public void displayDetails()
    {
        displayTarget();
        displayIndexOfArray();
        displayArrayElement();
    }

    public void displayArrayElement()
    {
        System.out.println("Your Array Element :::");
        for(int j = 0 ; j < indexOfArray ; j++)
        {
            System.out.print(" Element of index [ "+j+" ] :: " + array[j]);
            System.out.println();
        }
    }

    public void displayTarget()
    {
        System.out.println(" Target Element :::  " + target);
        
    }

    public void displayIndexOfArray()
    {
        System.out.println(" Array Index ::: " + indexOfArray);
        
    }
}
