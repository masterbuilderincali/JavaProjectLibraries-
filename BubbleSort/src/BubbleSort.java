
public class BubbleSort {
	/*How it work: 
	 *   repeatedly stepping through the list to be sorted, 
	 *   comparing each pair of adjacent items and swapping them if they are in the wrong order.
	 *   The pass through the list is repeated until no swaps are needed, which indicates that the list is sorted. 
	 *Efficiency:
	 *	 worst-case and average complexity both О(n2),   
	 *   bubble sort is not a practical sorting algorithm when n is large; perform better in best-case: list already sorted
	 *Cons:
	 *   The algorithm needs one whole pass without any swap to know it is sorted. 
	 *Optimizing:
	 *   The bubble sort algorithm can be easily optimized by observing that the n-th pass finds the n-th largest element and 
	 *   puts it into its final place. So, the inner loop can avoid looking at the last n-1 items when running for the n-th time
	 */
	
	
	public static void main(String[] args){
		int[] houseNums = {23, 76, 15, 47, 14, 38, 52};
		
		System.out.print("The original sequence:-\n    ");
		for(int i=0; i < houseNums.length; i++)
		{
			System.out.print(houseNums[i] + ", ");
		}
		System.out.println();
		
		SortEm(houseNums);
		
	}
	
	private static void SortEm(int[] ar){
		int temp;
		
		// i starts from the end, to control the length of each pass
		// j starts from the beginning, to compare and move larger item to the end(where i stops)
		for (int i=ar.length - 1; i>0; i--){
			for (int j=0; j<i; j++){
				if ( ar[j] > ar[j+1]){
					temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
				}
				
			}
		}
		
		System.out.print("The new sequence:-\n    ");
		for(int i=0; i < ar.length; i++)
		{
			System.out.print(ar[i] + ", ");
		}
		System.out.println();
	}

}
