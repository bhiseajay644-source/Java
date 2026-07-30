
public class ReverseAnArray {

	public static void main(String[] args) {
		int[] array= new int[] {1,2,3,4,5};
		int[][] a=new int[][] {{1,2,3},{4,5,6}};
		
		System.out.println("Reverse 1D array:");
		for(int row=array.length-1;row>=0;row--) {
			System.out.print(array[row]+"\t");
		}
		System.out.println();
		System.out.println("Reverse the 2D array:");
		for(int row=a.length-1;row>=0;row--) {
			for(int element=a[row].length-1;element>=0;element--) {
				System.out.print(a[row][element]+"\t");
			}
			System.out.println();
		}
	}

}
