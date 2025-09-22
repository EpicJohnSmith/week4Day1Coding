package coding;
import java.util.*;


public static void main(String[] args)
{
    // Generate array of 10 unique numbers from 1 to 30
    int[] arr = generate_random_unique(1, 30, 10);
    System.out.println("Generated array: " + Arrays.toString(arr));

    int target1 = arr[0];  // definitely in the array
    int target2 = 999;     // definitely not in the array

    // Test Scan
    System.out.println("Scan target1 (" + target1 + "): " + Scan(arr, target1));
    System.out.println("Scan target2 (" + target2 + "): " + Scan(arr, target2));

    // Test Stor
    System.out.println("Stor target1 (" + target1 + "): " + Stor(arr, target1));
    System.out.println("Stor target2 (" + target2 + "): " + Stor(arr, target2));



public class ScanandStor
{

	public static int[] generate_random_unique(int start, int end, int total)
	{
		int rangeSize = end - start;
		if (total > rangeSize || total <=0)
		{
			System.out.println("Error: cannot generate " + total + " unique numbers between " + start + " and " + end);
			
			return new int[0];
		}
	}
	
	List<Integer> numbers = new ArrayList<>();
	for (int i = start; i < end; i++)
	{
		numbers.add(i);
	}
	
	Collections.shuffle(numbers); // AI thinks this is for randomizing order
	
	int[] result = new int[total];
    for (int i = 0; i < total; i++)
    {
        result[i] = numbers.get(i);
    }
    return result;
    
    public static boolean Scan(int[] input, int target)
    {
    	for (int val : input)
    	{
            if (val == target)
            {
                return true;
            }
        }
        return false;
    }
    
    public static boolean Stor(int[] input, int target)
    {
    	int max = 0;
        for (int val : input) {
            if (val > max) max = val;
        }

        // create presence array
        int[] presence = new int[max + 1]; // +1 because index = value

        for (int val : input) {
            if (val >= 0) { // only for non-negative values
                presence[val] = 1;
            }
        }

        // print the presence array (for demo)
        System.out.println("Presence array:");
        System.out.println(Arrays.toString(presence));

        // check target
        if (target >= 0 && target < presence.length) {
            return presence[target] == 1;
        } else {
            return false;
        }
    }
    }
}
