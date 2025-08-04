
import java.util.Scanner;

public class Plus_One_In_Arrray_66 {

    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Plus_One_In_Arrray_66 pc = new Plus_One_In_Arrray_66();
        int[] user_Input = pc.get_Input_From_User();
        int[] final_Output = pc.plusOne(user_Input);
        pc.display_Array(final_Output);
    }
    
    public int[] plusOne(int[] user_Input) {
        String tempString = "";
        int divNumber;
        int convInt = 0;
        int size = user_Input.length;
        String convString = "";
        for (int i = 0; i < user_Input.length; i++) {
            if (i == 0) {
                convInt = user_Input[i];
            } else {
                convInt = convInt*10 + user_Input[i];
            }
        }
        convInt += 1;
        while (convInt > 0) {
            divNumber = convInt % 10;
            convString += divNumber;
            convInt /= 10;
        }
        for (int i = convString.length() - 1; i >= 0; i--) {
            tempString += convString.charAt(i);

        }
        int[] tempArray = new int[size];
        for (int i = 0; i < size; i++) {
            tempArray[i] = 1;
        }
        System.out.println("Temp string ::::::::::: " + tempString);
        for (int i = convString.length() - 1; i >= 0; i--) {
            tempArray[i] = Character.getNumericValue(convString.charAt(i));
            //  System.out.println(user_Input[i] + "::::::" + convString.charAt(i));     
        }
        // tempArray[2] = 100;
        return tempArray;
    }
    
    public int[] get_Input_From_User()
    {
        
        System.out.print("Enter Your Array : ");
        int size = sc.nextInt();
        int user_Input[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter Value On " + i + "::::");
            user_Input[i] = sc.nextInt();
        }
        return user_Input;
    }

    public void display_Array(int[] final_Output)
    {
        System.out.print("Your Final Answer Is :::: [" );
        for (int i = 0; i < final_Output.length; i++) {
            System.out.print(final_Output[i] + ",");
        }
        System.out.print("]");
    }
}
