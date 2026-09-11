package differenttypeofexceptions;

public class AbnormalTermination {
    public static void main(String[] args) {
        try{
            int z=100/0;
        }finally {
            System.out.println("Abnormal termination.!");
        }
    }
}
