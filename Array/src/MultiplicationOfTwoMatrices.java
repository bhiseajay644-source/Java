
public class MultiplicationOfTwoMatrices {

	public static void main(String[] args) {
		int[][] arr1=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int[][] arr2=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		
		int r1=arr1.length;
		int c2=arr2[1].length;
		int c1=arr1[0].length;
		int r2=arr2.length;
		int[][] result=new int[r1][c2];
		if(c1==r2) {
		for(int i=0;i<r1;i++) {
			for(int j=0;j<c1;j++) {
				for(int k=0;k<c2;k++) {
					result[i][k]=result[i][k]+arr1[i][j]*arr2[j][k];
				}
			}
		}
		}else {
			System.out.println("The multiplication of the matrix is not possible..!");
		}
		for(int[] row:result) {
			for(int element:row) {
				System.out.print(element+"\t");
			}
			System.out.println();
		}
	}

}
