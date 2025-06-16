
public class Transpose {
	
	// Print Matrix
	public static void PrintMatrix(int array[][]) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
	
	// Transpose of Matrix
	public static int[][] Transpose(int array1[][], int array2[][]) {
		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				array2[j][i] = array1[i][j];
			}
			System.out.println();
		}
		return array2;
	}

	
	// Main
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array1[][] = {{1,2,3}, {4,5,6}};
		int array2[][] = {{0,0},{0,0},{0,0}};
				
		System.out.println("before Transpose");
		PrintMatrix(array1);
		
		Transpose(array1, array2);
		System.out.println("after Transpose");
		PrintMatrix(array2);

		
		
//		System.out.println(array1.length);
//		System.out.println(array1[0].length);

		
//		System.out.println(array1.length);
		
//		PrintMatrix(array1);
		
//		for (int i = 0; i < array1.length; i++) {
//			for (int j = 0; j < array1[i].length; j++) {
//				System.out.print(array1[i][j]);
//				array2[j][i] = array1[i][j];
//			}
//			System.out.println();
//		}
		
//		PrintMatrix(array2);
		
	}

}
