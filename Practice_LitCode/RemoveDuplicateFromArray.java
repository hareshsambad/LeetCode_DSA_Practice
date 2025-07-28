

public class RemoveDuplicateFromArray {

    public static void main(String[] args) {
        int array[] = {0,0,1,1,1,2,2,3,3,4};
        int size = array.length;

        for(int i = 0; i < size ; i++)
        {
            for(int j = i+1 ; j < size ; j++)
            {
                if(array[i] == array[j])
                {
                    array[j] = Integer.MAX_VALUE;
                }
            }
        }

        int count = 0;

        for(int k = 0; k < size ; k++)
        {
            if(array[k] != Integer.MAX_VALUE)
            {
                array[count] = array[k];
                count++;
            }
        }
        System.out.println("count ::" + count);
        System.out.println(size);
        for (int idx = 0; idx < count; idx++) {
            System.out.print(array[idx] + ",");
        }
    }
}