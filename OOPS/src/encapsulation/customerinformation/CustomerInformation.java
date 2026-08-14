package encapsulation.customerinformation;

class Customer{
    int customerId;
    String customerName;
    static int totalCustomer;

    void set(int customerId,String customerName){
        this.customerId=customerId;
        this.customerName=customerName;
    }

    void displayDetails(){
        System.out.println("Customer Id :"+customerId);
        System.out.println("Customer Name : "+customerName);
        totalCustomer++;
        System.out.println();
    }
}
public class CustomerInformation {
    public static void main(String[] args) {
        Customer c=new Customer();
        c.set(101,"Rahul");
        c.displayDetails();
        Customer c1=new Customer();
        c1.set(102,"David");
        c1.displayDetails();
        Customer c2=new Customer();
        c2.set(103,"Priya");
        c2.displayDetails();
        System.out.println("Total Customers : "+Customer.totalCustomer);

    }
}
