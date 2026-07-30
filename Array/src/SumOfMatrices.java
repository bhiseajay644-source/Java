
public class SumOfMatrices {

	public static void main(String[] args) {
		int[][] m1= {{1,2,3},{4,5,6}};
		int[][] m2= {{9,8,7},{6,5,4}};
		
		int r1=m1.length;
		int r2=m2.length;
		int c1=m1[0].length;
		int c2=m2[0].length;
		int[][] result=new int[r1][c1];
		if(c1==c2 && r1==r2) {
			for(int row=0;row<r1;row++) {
				for(int col=0;col<c1;col++) {
					result[row][col]=m1[row][col]+m2[row][col];
				}
			}
		}else {
			System.out.println("The addition of matrices are not done.");
		}
		System.out.println("The result of matrix addition:");
		for(int[] row:result) {
			for(int element:row) {
				System.out.print(element+"\t");
			}
			System.out.println();
		}
	}

}
