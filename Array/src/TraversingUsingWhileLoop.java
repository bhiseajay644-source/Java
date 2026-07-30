
public class TraversingUsingWhileLoop {

	public static void main(String[] args) {
		int[] array=new int[]{1,2,3,4,5,6};
		int i=0;
		while(i<array.length) {
			System.out.print(array[i]+"\t");
			i++;
		}
		System.out.println();
		System.out.println("1d array using do while loop:");
		int j=0;
		do{
		System.out.print(array[j]+"\t");	
		j++;
		}
		while(j<array.length);
		System.out.println();
	}

}
