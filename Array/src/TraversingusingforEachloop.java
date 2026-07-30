
public class TraversingusingforEachloop {

	public static void main(String[] args) {
		int[] a=new int[] {1,2,3,4,5,6,7};
		char[][] b=new char[][] {{'a','e','i'},{'o','u','a'},{'e','i','o'}};
		int[][][] c=new int[][][] {{{1,2,3},{4,5,6}},{{7,8,9},{1,2,3}}};
		System.out.println("1D array using for each loop:");
		for(int element:a) {
			System.out.print(element+"\t");
		}
		System.out.println();
		System.out.println("2D array using for each loop:");
		for(char[] row:b) {
			for(char element:row) {
				System.out.print(element+"\t");
			}
			System.out.println();
		}
		System.out.println("3D array using for each loop:");
		for(int[][] row:c) {
			for(int[] sub:row) {
				for(int ele:sub) {
					System.out.print(ele+"\t");
				}
				System.out.println();
			}
		}
	}
}
