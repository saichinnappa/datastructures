import java.util.Arrays;


public class BubbleSort {

	/**
	 * @param args
	 */
	public static int elementsList[] = {9,8,7,6,5,4,3,2,1,0};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bubbleSort(elementsList,elementsList.length);
	}
	private static void bubbleSort(int[] elementsList2, int length) {
		// TODO Auto-generated method stub
		int temp = 0;
		int counter =1;
		System.out.println("Before Sorting::"+Arrays.toString(elementsList2));
		for(int j=0;j<length;j++)
		{
			for (int i=0; i<length-counter; i++)
			{
				//System.out.println(length-counter+"<<");
				System.out.println("Comparing Elements "+ elementsList2[i]+" & "+elementsList2[i+1]);
				if(elementsList2[i] > elementsList2[i+1] )
				{
					
					temp = elementsList2[i];
					elementsList2[i] = elementsList2[i+1];
					elementsList2[i+1]= temp;
					System.out.println("Swapping Element "+temp+" with "+elementsList2[i]);
					System.out.println("STEP "+j+"."+i+"::"+Arrays.toString(elementsList2));
				}
				
			}
			counter++;
			
		}
		System.out.println("After Sorting::"+Arrays.toString(elementsList2));
	}

}
