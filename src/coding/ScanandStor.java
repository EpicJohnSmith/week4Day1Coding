package coding;
import java.util.*;




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
}
