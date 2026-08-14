
public class Traversingusingwhileanddowhileon2dArray {

	public static void main(String[] args) {
		int[][] a=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int row=0;
		System.out.println("2d array traversing using the while loop:");
		while(row<a.length) {
			int element=0;
			while(element<a[row].length) {
				System.out.print(a[row][element]+"\t");
				element++;
			}
			row++;
			System.out.println();
		}
		System.out.println("Reverse traversing:");
		int row1=a.length-1;
		while(row1>=0) {
			int element1=a[row1].length-1;
			while(element1>=0) {
				System.out.print(a[row1][element1]+"\t");
				element1--;
			}
			row1--;
			System.out.println();
		}
	}

}
