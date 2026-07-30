import java.util.Arrays;
public class JaggerArray {

	public static void main(String[] args) {
		int[][] jagged= new int[3][];
		jagged[0]= new int[]{1};
		jagged[1]= new int[] {1,2};
		jagged[2]=new int[] {1,2,3};
		System.out.print(jagged[0][0]);
		System.out.println();
		System.out.print(jagged[1][0]+"  "+jagged[1][1]);
		System.out.println();
		System.out.print(jagged[2][0]+"  "+jagged[2][1]+"  "+jagged[2][2]);
		System.out.println();
		System.out.println(String.valueOf(jagged[0][0]));
		System.out.println(String.valueOf(jagged[1][0]));
		System.out.println(String.valueOf(jagged[2][0]));
		System.out.println(Arrays.toString(jagged[1]));
	}

}
