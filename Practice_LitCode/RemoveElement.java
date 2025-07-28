public class RemoveElement {
    public static void main(String[] args) {
        int array[] = {1,2,3,4,3,3,3};
        int n = 5;
        int size = array.length;

        for(int i = 0 ; i < size ; i++)
        {
            if(array[i] == n)
            {
                array[i] = Integer.MAX_VALUE;
            }
        }
        int count = 0;
        for(int j = 0; j < size ; j++)
        {
            if(array[j] != Integer.MAX_VALUE)
            {
                array[count] = array[j];
                count++;
            }
        }
        


        for(int k = 0; k < count ; k++)
        {
            System.out.print(array[k] + ",");
        }
    }
}
