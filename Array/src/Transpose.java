
public class Transpose {

	public static void main(String[] args) {
		int[][] matrix= {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
		int rows=matrix.length;
		int cols=matrix[0].length;
		int[][] transpose=new int[cols][rows];
		System.out.println("Given matrix:");
		for(int[] row:matrix) {
			for(int element:row) {
				System.out.print(element+"\t");
			}
			System.out.println();
		}
		System.out.println("Matrix with transpose:");
		for(int row=0;row<matrix.length;row++) {
			for(int col=0;col<matrix[row].length;col++) {
				transpose[col][row]=matrix[row][col];
			}
			System.out.println();
		}
		for(int[] row:transpose) {
			for(int col:row) {
				System.out.print(col+"\t");
			}
			System.out.println();
		}
	}

}
