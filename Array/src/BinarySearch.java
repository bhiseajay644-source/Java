import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of the array: ");
        int n = scan.nextInt();
        int[] arr = new int[n];

        
        for (int i = 0; i < n; i++) {
        	System.out.println("Enter the elements for index:"+i);
            arr[i] = scan.nextInt();
        }
        System.out.println("Enter the key to find:");
        int key=scan.nextInt();
        int left=arr[0];
        int right=arr.length-1;
        boolean found=false;
        while(left<=right) {
        	int mid=left+(left+right)/2;
        	if(arr[mid]==key) {
        		found=true;
        		System.out.println("The key is found at index:"+mid);
        		break;
        	}else if(key>arr[mid]) {
        		left=mid+1;
        	}else if(key<arr[mid]){
        		right=mid-1;
        	}
        }
        if(!found) {
        	System.out.println("Enter the valid key..");
        }
        scan.close();
    }
}
