
public class ReverseTraversing {

	public static void main(String[] args) {
		int[] a=new int[] {1,2,3,4,5};
		int[][] b=new int[][] {{1,2,3},{4,5,6},{7,8,9}};
		int[][][] c=new int[][][] {{{1,2,3}},{{4,5,6}},{{7,8,9}}};
		System.out.println("Reverse traversing of 1d array:");
		for(int row=a.length-1; row>=0;row--) {
			System.out.print(a[row]+"\t");
		}
		System.out.println();
		System.out.println("reverse traversing of the 2d array:");
		for(int row=b.length-1; row>=0;row--) {
			for(int element=b.length-1;element>=0;element--) {
				System.out.print(b[row][element]+"\t");
			}
			System.out.println();
		}
		System.out.println(" Reverse traversing of the 3d array:");
		for(int row=c.length-1;row>=0;row--) {
			for (int sub=c[row].length-1;sub>=0;sub--) {
				for(int element=c[row][sub].length-1;element>=0;element--) {
					System.out.print(c[row][sub][element]+"\t");
				}
				System.out.println();
			}
		}
		}
		
}
