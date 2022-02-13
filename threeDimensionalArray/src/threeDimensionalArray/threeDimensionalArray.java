package threeDimensionalArray;

public class threeDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][][] test = {
	{
		{1, 2, 3},
		{2, 3, 4}
	},
	{
		{-4, -5, 6, 9},
		{1},
		{2, 3}
	}
		};
		
		for (int [][] secondDimensionalArray: test) {
			for (int [] Array: secondDimensionalArray) {
				for (int item: Array) {
					System.out.println(item);
				}
			}
		}
			
		}
		
}
