
public class TraversingOnArray {

	public static void main(String[] args) {
		int[] a= new int[] {1,2,3,4,5,6};
		int[][] b= new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int[][][] c=new int[][][] {{{1,2,3}},{{4,5,6}},{{7,8,9}}};
		System.out.println("1-d array:");
		for(int index=0;index<a.length;index++) {
			System.out.print(a[index]+"\t");
		}
		System.out.println();
		System.out.println("The 2d array:");
		for(int row=0;row<b.length;row++) {
			for(int element=0 ;element<b[row].length;element++) {
				System.out.print(b[row][element]+"\t");
			}
			System.out.println();
		}
	System.out.println();
	System.out.println("The 3d array:");
	for(int row=0 ; row<c.length;row++) {
		for(int sub=0;sub<c[row].length;sub++) {
		for(int element=0;element<c[row][sub].length;element++) {
			System.out.print(c[row][sub][element]+"\t");
		}
		System.out.println();
		}
	}
	}
}	
