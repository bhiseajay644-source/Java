import java.util.Scanner;

public class SplitArrayLargestSum {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number of packages:");
		int size=scan.nextInt();
		int[] array=new int[size];
		for(int i=0;i<size;i++) {
			System.out.println("Enter the elements for the index:"+i);
			array[i]=scan.nextInt();
		}
		System.out.println("Enter the number of trucks:");
		int m=scan.nextInt();
		int left=array[0];
		 for (int num : array) {
	            if (num > left) {
	                left = num;
	            }
	        }

	        // Step 2: find sum of all elements (right boundary)
	        int right = 0;
	        for (int num : array) {
	            right += num;
	        }

	        // Step 3: binary search
	        while (left < right) {
	            int mid = left + (right - left) / 2;
	            int count = 1;
	            int currentSum = 0;

	            // greedy check inline
	            for (int num : array) {
	                if (currentSum + num > mid) {
	                    count++;
	                    currentSum = num;
	                } else {
	                    currentSum += num;
	                }
	            }

	            if (count > m) {
	                left = mid + 1; // too small, need bigger load
	            } else {
	                right = mid;    // valid, try smaller load
	            }
	        }
	        System.out.println("Minimum possible maximum load:"+left);
		scan.close();
	}

}
