import java.util.Scanner;

public class LinearSearchAlgorithm {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=scan.nextInt();
		int[] studentRolls=new int[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter the elements for index:"+i);
			studentRolls[i]=scan.nextInt();
		}
		System.out.println("Enter the roll number:");
		int roll = scan.nextInt();
		int index=0;
		boolean flag=false;
		for(int i=0;i<size;i++) {
			if(studentRolls[i]==roll) {
				flag=true;
				break;
			}
			index++;
		}
		if(flag==true) {
			System.out.println(roll+" is found at index: "+index);
		}else {
			System.out.println(roll + " is not found.");
		}
		scan.close();
	}

}
