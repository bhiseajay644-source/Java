import java.util.Arrays;

public class oneDimensionalArray {

	public static void main(String[] args) {
		int[] a=new int [] {1,2,3,4 };
		int[][] a1= {{1,2,3,4},{5,6,7,8}};
		int[][][] a2=new int[][][] {{{1,2,3},{4,5,6}}};
		System.out.print(a[0]+" "+a[1]+" "+a[2]+" "+a[3]);
		System.out.println();
		System.out.print(a1[0][0]+" "+a1[0][1]+" "+a1[0][2]+" "+a1[0][3]);
		System.out.println();
		System.out.print(a1[1][0]+" "+a1[1][1]+" "+a1[1][2]+" "+a1[1][3]);
		System.out.println();
		System.out.print(a2[0][0][0]+" "+a2[0][0][1]+" "+a2[0][0][2]);
		System.out.println();
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(a2[0][0]));
		System.out.println(Arrays.toString(a2[0][1]));
	}

}
