
public class TraversingUsingWhileLoopFor1dArray {

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
		
		//reverse traversing
		System.out.println("1d reverse array using while loop:");
		int i1=array.length-1;
		while(i1>=0) {
			System.out.print(array[i1]+"\t");
			i1--;
		}
		System.out.println();
		System.out.println("1d array reverse traversing using do while loop:");
		int j1=array.length-1;
		do {
			System.out.print(array[j1]+"\t");
			j1--;
		}
		while(j1>=0);
		System.out.println();
	}

}
