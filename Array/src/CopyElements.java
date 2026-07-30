import java.util.Arrays;

public class CopyElements {
	public static void main(String[] args) {
		int[] array= {1,2,3,4,5,6};
		int[] array2=new int[array.length];
	
		for(int i=0;i<array.length;i++) {
			array2[i]=array[i];
		}
	
	for(int i=0;i<array2.length;i++) {
		System.out.print(array2[i]+"\t");
	}
}
}
