import java.util.Scanner;

public class PurchaseDiscountArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the number of customers:");
        int size=scan.nextInt();
        scan.nextLine();
        int[] amount=new int[size];
        String[] name=new String[size];

        for(int i=0;i<name.length;i++){
            System.out.println("Enter the name :"+i);
            name[i]=scan.nextLine();
        }
        for(int i=0;i<amount.length;i++){
            System.out.println("Enter the amount: "+i);
            amount[i]=scan.nextInt();
        }

        for(int i=0;i<amount.length;i++){
            if(amount[i]>=5000){
                amount[i] = amount[i]-(int)(amount[i]*0.1);
            }
        }
        for(int i=0;i<name.length;i++){
            System.out.println("Customer "+i+" Final amount "+amount[i]);
        }
        scan.close();

    }
}
