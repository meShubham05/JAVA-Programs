package Arrays;

public class RemoveDuplicateFromArray {

    public static void main(String[] args) {
        int array[] = new int[]{1, 2, 4, 5, 2, 3, 8, 2, 9, 3, 1,1,2,1,2,3,3,16,10,10,12};
      
        // Expected O/P: 1,2,4,5,3,8,9

        System.out.println("Original Array Elements:");
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++) 
        {
            System.out.print(array[i] + " ");
        }
        
        System.out.println("}");

        // Temporary array to store result
        int temp[] = new int[array.length];
        int index = 0;

        for (int i = 0; i < array.length; i++) 
        {
            boolean isDuplicate = false;

            // Check if the element has already appeared in the result
            for (int j = 0; j < index; j++) 
            {
                if (array[i] == temp[j]) 
                {
                    isDuplicate = true;
                    break;
                }
            }

            // If the element is not a duplicate, add it to the result
            if (!isDuplicate) 
            {
                temp[index++] = array[i];
            }
        }

        System.out.println("After removing the duplicate elements:");
        // Print the result in the required format
        for (int i = 0; i < index; i++) 
        {            
            System.out.print(temp[i]+" ");
        }
    }
}
